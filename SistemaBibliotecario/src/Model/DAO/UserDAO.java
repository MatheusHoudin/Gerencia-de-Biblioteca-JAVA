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
import java.util.ArrayList;
import java.util.List;
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
                us.setUser(rs.getString("user"));
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
    
    public List<User> find(String name){
        String sql = "SELECT * FROM user where user.name LIKE ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+name+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUser(rs.getString("user"));
                users.add(user);
            }
        } catch (SQLException ex) {
            System.err.println("Error on find Users");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return users;
    }
    
    public User find(int id){
        String sql = "SELECT * FROM user WHERE user.id = ?";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUser(rs.getString("user"));
                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;  
    }
    
    public List<User> findAll(){
        String sql = "SELECT * FROM user";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUser(rs.getString("user"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException ex) {
            System.err.println("Error on find Users");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return users;
    }
    
    public boolean delete(int idUser){
        String sql = "DELETE FROM user WHERE user.id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idUser);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean update(User user){
        String sql = "UPDATE user SET name = ?, user = ?, password = ? where id = ?";
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getUser());
            stmt.setString(3, user.getPassword());
            stmt.setInt(4, user.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error on update user:"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
}
