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
import java.sql.SQLException;

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

    public void setConnection(Connection con) {
        this.con = con;
    }
    
}
