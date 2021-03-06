/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Book;
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
public class BookDAO {
    private Connection con = null;
    
    private BookDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public static BookDAO getInstance(){
        return new BookDAO();
    }
    
    public boolean insert(Book book){
        String sql = "INSERT INTO book (title,author,theme,publishingCompany,edition) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getTheme());
            stmt.setString(4, book.getPublishingCompany());
            stmt.setInt(5, book.getEdition());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error on insert book:"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Book> findAll(){
        String sql = "SELECT * FROM book ORDER BY title";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Book> books = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setTheme(rs.getString("theme"));
                book.setAuthor(rs.getString("author"));
                book.setPublishingCompany(rs.getString("publishingCompany"));
                book.setEdition(rs.getInt("edition"));
                
                books.add(book);
            }
        } catch (SQLException ex) {
            System.err.println("Error on find books:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return books;
    }
    
    public Book find(int id){
        String sql = "SELECT * FROM book WHERE book.id = ?";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setEdition(rs.getInt("edition"));
                book.setTheme(rs.getString("theme"));
                book.setPublishingCompany(rs.getString("publishingCompany"));
                
                return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    public List<Book> findAll(String title){
        String sql = "SELECT * FROM book as b WHERE b.title LIKE ?";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Book> books = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+title+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setTheme(rs.getString("theme"));
                book.setAuthor(rs.getString("author"));
                book.setPublishingCompany(rs.getString("publishingCompany"));
                book.setEdition(rs.getInt("edition"));  
                books.add(book);
            }
        } catch (SQLException ex) {
            System.err.println("Error on find books:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return books;
    }
    
    public Book find(String title,int edition){
        String sql = "SELECT * FROM book as b WHERE b.title = ? AND b.edition = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Book book = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setInt(2, edition);
            rs = stmt.executeQuery();
            
            book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setTheme(rs.getString("theme"));
            book.setAuthor(rs.getString("author"));
            book.setPublishingCompany(rs.getString("publishingCompany"));
            book.setEdition(rs.getInt("edition"));  
            
        } catch (SQLException ex) {
            System.err.println("Error on find books:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return book;
    }
    
     public boolean delete(int idBook){
        String sql = "DELETE FROM book WHERE book.id = ?";
        PreparedStatement stmt = null;
        
         try {
             stmt = con.prepareStatement(sql);
             stmt.setInt(1, idBook);
             stmt.executeUpdate();
             return true;
         } catch (SQLException ex) {
             System.err.println("Error on delete book:"+ex);
             return false;
         }finally{
             ConnectionFactory.closeConnection(con, stmt);
         }
         
    }
     
    public boolean update(Book book){
        String sql = "UPDATE book SET title = ?,author = ?,theme = ?,publishingCompany = ?,edition = ? where id = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getTheme());
            stmt.setString(4, book.getPublishingCompany());
            stmt.setInt(5, book.getEdition());
            stmt.setInt(6, book.getId());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error on insert book:"+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void setConnection(Connection con){
        this.con = con;
    }
}
