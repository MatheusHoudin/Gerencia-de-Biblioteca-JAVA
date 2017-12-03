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
    public Exemplary findExemplary(int id){
        String sql = "SELECT * FROM exemplary where exemplary.id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, id);
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Exemplary ex = new Exemplary();
                 ex.setId(rs.getInt("book"));
                 ex.setIdExemplary(rs.getInt("id"));
                 if(rs.getInt("avaliable")==1){
                     ex.setAvaliable(true);
                 }else{
                     ex.setAvaliable(false);
                 }
                 return ex;
             }
         } catch (SQLException ex) {
             System.err.println("Error on find exemplary "+ex);
             return null;
         }
         return null;
    }
    public List<Exemplary> find(String title){
        String sql = "SELECT * FROM exemplary JOIN book ON book.id = exemplary.book WHERE book.title LIKE ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Exemplary> exemplarys = new ArrayList<>();
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setString(1, "%"+title+"%");
             
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Exemplary ex = new Exemplary();
                 ex.setIdExemplary(rs.getInt("id"));
                 ex.setTitle(rs.getString("title"));
                 ex.setId(rs.getInt("book"));
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
    
    public boolean delete(int idExemplary){
        String sql = "DELETE FROM exemplary WHERE exemplary.id = ? AND exemplary.avaliable != 1";
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, idExemplary);
             if(stmt.executeUpdate()==1){
                 return true;
             }
         } catch (SQLException ex) {
             System.err.println("Error on delete exemplary:"+ex);
             return false;
         }finally{
             ConnectionFactory.closeConnection(con, stmt);
         }
         return false;
    }
    
     public boolean deleteByBookId(int idBook){
        String sql = "DELETE FROM exemplary WHERE exemplary.book = ? AND exemplary.avaliable != 1";
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, idBook);
             stmt.executeUpdate();
             return true;
         } catch (SQLException ex) {
             System.err.println("Error on delete exemplary:"+ex);
             return false;
         }finally{
             ConnectionFactory.closeConnection(con, stmt);
         }
    }
     
    public boolean updateAvailability(int exemplaryId, boolean isAvaliable){
        String sql = "UPDATE exemplary SET avaliable = ? WHERE id = ?";
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             if(isAvaliable){
                 stmt.setInt(1, 1);
             }else{
                 stmt.setInt(1, 0);
             }
             stmt.setInt(2, exemplaryId);
             if(stmt.executeUpdate()==1){
                 return true;
             }
         } catch (SQLException ex) {
             System.err.println("Error on update exemplary "+ex);
             return false;
         }finally{
             ConnectionFactory.closeConnection(con, stmt);
         }
         return false;
    }

    public void setConnection(Connection con) {
        this.con = con;
    }
    
}
