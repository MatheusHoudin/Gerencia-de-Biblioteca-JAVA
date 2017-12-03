/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Lending;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XXXXXX
 */
public class LendingDAO {
    private Connection con = null;
    
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
}
