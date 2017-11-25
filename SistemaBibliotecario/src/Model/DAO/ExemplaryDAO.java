/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Exemplary;
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
public class ExemplaryDAO {
     private Connection con = null;
    
    private ExemplaryDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public static ExemplaryDAO getInstance(){
        return new ExemplaryDAO();
    }
    
    public boolean insert(Exemplary exemplary){
        String sql = "INSERT INTO exemplary(avaliable,book) VALUES(?,?)";
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, exemplary.isAvaliable() ? 1 : 0);
             stmt.setInt(2, exemplary.getId());
             
             stmt.executeUpdate();
             return true;
         } catch (SQLException ex) {
            System.err.println("Error on insert exemplary:"+ex);
            return false;
         }finally{
             ConnectionFactory.closeConnection(con, stmt);
         }
    }
    
    public List<Exemplary> find(int bookId){
        String sql = "SELECT * FROM exemplary JOIN book ON book.id = exemplary.book WHERE book.id = ? ";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Exemplary> exemplarys = new ArrayList<>();
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, bookId);
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Exemplary ex = new Exemplary();
                 ex.setIdExemplary(rs.getInt("id"));
                 ex.setId(rs.getInt("book"));
                 ex.setTitle(rs.getString("title"));
                 if(rs.getInt("avaliable")==1){
                     ex.setAvaliable(true);
                 }else{
                     ex.setAvaliable(false);
                 }
                 exemplarys.add(ex);
             }
         } catch (SQLException ex) {
             System.err.println("Error on find exemplarys:"+ex);
         }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
         return exemplarys;
    }
    
    public List<Exemplary> findAll(){
        String sql = "SELECT * FROM exemplary JOIN book ON book.id = exemplary.book";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Exemplary> exemplarys = new ArrayList<>();
        
         try {
             stmt = con.prepareStatement(sql);
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Exemplary ex = new Exemplary();
                 ex.setIdExemplary(rs.getInt("id"));
                 ex.setId(rs.getInt("book"));
                 ex.setTitle(rs.getString("title"));
                 if(rs.getInt("avaliable")==1){
                     ex.setAvaliable(true);
                 }else{
                     ex.setAvaliable(false);
                 }
                 exemplarys.add(ex);
             }
         } catch (SQLException ex) {
             System.err.println("Error on find exemplarys:"+ex);
         }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
        
        return exemplarys;
    }

    public void setConnection(Connection con) {
        this.con = con;
    }
    
}
