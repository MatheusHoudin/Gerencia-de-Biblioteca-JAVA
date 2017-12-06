/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.Bean.Exemplary;
import Model.Bean.Lending;
import Model.Bean.User;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import Model.DAO.LendingDAO;
import Model.DAO.UserDAO;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XXXXXX
 */
public class DAOFindController {
    
    public static void fillJComboBoxBooks(JComboBox jCombo){
        BookDAO bookDao = DAOFactory.getInstanceBookDAO();
        for(Book b:bookDao.findAll()){
            jCombo.addItem(b);
        }
    }
    
    public static void fillJTableBooks(JTable jTableBooks){
        DefaultTableModel dtm = (DefaultTableModel) jTableBooks.getModel();
        dtm.setNumRows(0);
        BookDAO bDao = DAOFactory.getInstanceBookDAO();
        
        for(Book book:bDao.findAll()){
            dtm.addRow(new Object[]{
                book.getId(),
                book.getTitle(),
                book.getTheme(),
                book.getAuthor(),
                book.getEdition(),
                book.getPublishingCompany()
            });
           
        }
    }
    
    public static void fillJTableUsers(JTable jTableUsers,String login){
        DefaultTableModel dtm = (DefaultTableModel) jTableUsers.getModel();
        dtm.setNumRows(0);
        UserDAO uDAO = DAOFactory.getInstanceUserDAO();
        
        for(User user:uDAO.find(login)){
            dtm.addRow(new Object[]{
                user.getId(),
                user.getName(),
                user.getUser()
            });
        }
    }
    
    public static void fillJTableUsers(JTable jTableUsers){
        DefaultTableModel dtm = (DefaultTableModel) jTableUsers.getModel();
        dtm.setNumRows(0);
        UserDAO uDAO = DAOFactory.getInstanceUserDAO();
        
        for(User user:uDAO.findAll()){
            dtm.addRow(new Object[]{
                user.getId(),
                user.getName(),
                user.getUser(),
                user.getPassword()
            });
        }
    }
    
    public static void fillJTableBooks(JTable jTableBooks,String filter){
        DefaultTableModel dtm = (DefaultTableModel) jTableBooks.getModel();
        dtm.setNumRows(0);
        BookDAO bDao = DAOFactory.getInstanceBookDAO();
        
        for(Book book:bDao.findAll(filter)){
            dtm.addRow(new Object[]{
                book.getId(),
                book.getTitle(),
                book.getTheme(),
                book.getAuthor(),
                book.getEdition(),
                book.getPublishingCompany()
            });
        }
    }
    
    public static void fillJTableExemplarys(JTable jTableExemplarys,Book book){
        DefaultTableModel dtm = (DefaultTableModel) jTableExemplarys.getModel();
        dtm.setNumRows(0);
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        for(Exemplary exemplary:exemplaryDAO.find(book.getId())){
            dtm.addRow(new Object[]{
                exemplary.getIdExemplary(),
                exemplary.getTitle(),
                exemplary.isAvaliable() ? "Disponível":"Indisponível",
                exemplary.getId()
            });
        }
    }
    
    public static void fillJTableExemplarys(JTable jTableExemplarys){
        DefaultTableModel dtm = (DefaultTableModel) jTableExemplarys.getModel();
        dtm.setNumRows(0);
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        for(Exemplary exemplary:exemplaryDAO.findAll()){
            dtm.addRow(new Object[]{
                exemplary.getIdExemplary(),
                exemplary.getTitle(),
                exemplary.isAvaliable() ? "Disponível":"Indisponível",
                exemplary.getId()
            });
        }
    }
    
    public static void fillJTableExemlarys(JTable jTableExemplarys,String title){
        DefaultTableModel dtm = (DefaultTableModel) jTableExemplarys.getModel();
        dtm.setNumRows(0);
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        for(Exemplary exemplary:exemplaryDAO.find(title)){
            dtm.addRow(new Object[]{
                exemplary.getIdExemplary(),
                exemplary.getTitle(),
                exemplary.isAvaliable() ? "Disponível":"Indisponível",
                exemplary.getId()
            });
        }
    }
    
    public static void fillJTableLendings(JTable jTableLendings){
        DefaultTableModel dtm = (DefaultTableModel) jTableLendings.getModel();
        dtm.setNumRows(0);
        LendingDAO lendingDAO = DAOFactory.getInstanceLendingDAO();
        
        for(Lending lending:lendingDAO.findAll()){
            dtm.addRow(new Object[]{
                lending.getId(),
                lending.getExemplary().getTitle(),
                lending.getExemplary().getEdition(),
                lending.getExemplary().getIdExemplary(),
                lending.getLendingLibrarian().getName(),
                lending.getDevolutionLibrarian()!=null ? lending.getDevolutionLibrarian().getName():"",
                lending.getUser().getName(),
                lending.getLendingDate(),
                lending.getDevolutionDate(),
                lending.getPenality(),
                lending.isStatus() ? "Em andamento":"Encerrado"
            });
        }
    }
}
