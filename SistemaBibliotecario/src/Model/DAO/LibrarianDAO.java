/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Librarian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XXXXXX
 */
public class LibrarianDAO {
    private Connection con = null;
    
    private LibrarianDAO(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public static LibrarianDAO getInstance(){
        return new LibrarianDAO();
    }
    
    public boolean insert(Librarian librarian){
        String sql = "INSERT INTO librarian(name,user,password) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, librarian.getName());
            stmt.setString(2, librarian.getUser());
            stmt.setString(3, librarian.getPassword());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error on insert librarian:"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public List<Librarian> findAll(){
        String sql = "SELECT * FROM librarian";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Librarian> librarians = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Librarian l = new Librarian();
                l.setId(rs.getInt("id"));
                l.setName(rs.getString("name"));
                l.setUser(rs.getString("user"));
                l.setPassword(rs.getString("password"));
                
                librarians.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return librarians;
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
}
