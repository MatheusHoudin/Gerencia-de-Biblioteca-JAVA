/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Connection.DAOFactory;
import Controller.LoginController;
import Model.Bean.Book;
import Model.Bean.Exemplary;
import Model.Bean.Lending;
import Model.Bean.Librarian;
import Model.Bean.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XXXXXX
 */
public class LendingDAO {
    private Connection con = null;

    public void setCon(Connection con) {
        this.con = con;
    }
    
    private LendingDAO(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public static LendingDAO getInstance(){
        return new LendingDAO();
    }
    
    public boolean registerLending(Lending lending){
        String sql = "INSERT INTO lending(lendingDate,exemplary,user,lendingLibrarian,status) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, lending.getLendingDate());
            stmt.setInt(2, lending.getExemplary().getIdExemplary());
            stmt.setInt(3, lending.getUser().getId());
            stmt.setInt(4, lending.getLendingLibrarian().getId());
            stmt.setInt(5, lending.isStatus() ? 1:0);
            
            if(stmt.executeUpdate()==1){
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("error on create lending "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public List<Lending> findAll(){
        String sql = "SELECT * FROM lending";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Lending> lendings = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                BookDAO bDAO = DAOFactory.getInstanceBookDAO();
                LibrarianDAO libDAO = DAOFactory.getInstanceLibrarianDAO();
                UserDAO uDAO = DAOFactory.getInstanceUserDAO();
                ExemplaryDAO eDAO = DAOFactory.getInstanceExemplaryDAO();
                
                Lending lending = new Lending();
                lending.setId(rs.getInt("id"));
                lending.setDevolutionDate(rs.getDate("devolutionDate"));
                lending.setLendingDate(rs.getDate("lendingDate"));
                lending.setPenality(rs.getFloat("penality"));
                if(rs.getInt("status")==1){
                    lending.setStatus(true);
                }else{
                    lending.setStatus(false);
                }
                
                Exemplary ex = eDAO.findExemplary(rs.getInt("exemplary"));
                Book book = bDAO.find(ex.getId());
                ex.setTitle(book.getTitle());
                ex.setEdition(book.getEdition());
                User user = uDAO.find(rs.getInt("user"));
                Librarian libLending = libDAO.find(rs.getInt("lendingLibrarian"));
                libDAO = DAOFactory.getInstanceLibrarianDAO();
                Librarian libDevolution = libDAO.find(rs.getInt("devolutionLibrarian"));
                
                lending.setExemplary(ex);
                lending.setUser(user);
                lending.setLendingLibrarian(libLending);
                lending.setDevolutionLibrarian(libDevolution);
                
                lendings.add(lending);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lendings;      
    }
    
    private Lending find(int id){
        String sql = "SELECT * FROM lending WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Lending len = new Lending();
                len.setId(rs.getInt("id"));
                len.setLendingDate(rs.getDate("lendingDate"));
                len.setStatus((rs.getInt("status")==1));
                return len;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public boolean update(int id){
        String sql = "UPDATE lending SET lending.lendingDate = ? WHERE lending.id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            Lending len = this.find(id);
            if(len.isValidToRenovate()){
                Date date = new Date(System.currentTimeMillis());
                stmt.setDate(1, date);
                stmt.setInt(2, id);
            
                return stmt.executeUpdate()==1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public boolean devolution(int id){
        String sql = "UPDATE lending SET lending.devolutionDate = ?,lending.penality =  ?,"
                + "lending.devolutionLibrarian = ?,lending.status = ? WHERE lending.id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(5, id);
            Date date = new Date(System.currentTimeMillis());
            stmt.setDate(1, date);
            
            Lending lending = this.find(id);
            lending.calculatePenality();
            stmt.setFloat(2, lending.getPenality());
            stmt.setInt(3, LoginController.loggedLibrarian.getId());
            stmt.setInt(4, 0);
            
            return stmt.executeUpdate()==1;
            
        } catch (SQLException ex) {
            Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean validateLending(int idUser,int idBook){
        String sql = "SELECT * FROM (((lending JOIN exemplary ON lending.exemplary = exemplary.id) JOIN"
                + " book ON book.id = exemplary.book) JOIN user ON lending.user = user.id) WHERE "
                + "lending.user = ? AND book.id = ?";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idUser);
            stmt.setInt(2, idBook);
            
            rs = stmt.executeQuery();
            if(rs.next()){
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LendingDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return true;
    }
}
