/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XXXXXX
 */
public class UserDAO {
    private Connection con = null;
    
    private UserDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public static UserDAO getInstance(){
        return new UserDAO();
    }
    
    public boolean insert(User user){
        String sql = "INSERT INTO user(name,user,password) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getUser());
            stmt.setString(3, user.getPassword());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error on insert user:"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public User find(String user,String password){
        String sql = "SELECT * FROM user where user = ? AND password = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
       
           
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,user);
            stmt.setString(2,password);
            rs = stmt.executeQuery();
            if(rs.next()){
                User us = new User();
                us.setId(rs.getInt("id"));
                us.setName(rs.getString("name"));
                us.setPassword(rs.getString("password"));
            
            
            return us;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                    
            
            
            
            return null;
                
     
     
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
}
