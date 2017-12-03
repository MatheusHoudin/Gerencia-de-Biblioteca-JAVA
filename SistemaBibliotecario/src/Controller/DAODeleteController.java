/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Exemplary;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import Model.DAO.UserDAO;
import View.ViewDelete.ViewDeleteBook;
import View.ViewDelete.ViewDeleteExemplary;
import View.ViewDelete.ViewDeleteUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author XXXXXX
 */
public class DAODeleteController {
    
    public static boolean deleteExemplary(ViewDeleteExemplary viewDeleteExemplary){
        int[] rowsSelected = viewDeleteExemplary.getjTableExemplarys().getSelectedRows();
        int numberExemplarysSelected = rowsSelected.length;
        
        ExemplaryDAO exDAO = DAOFactory.getInstanceExemplaryDAO();
        List<Integer> idExemplarys = DAODeleteController.searchIdExemplarys(rowsSelected, viewDeleteExemplary.getjTableExemplarys());
        
        for(Integer id:idExemplarys){
            if(exDAO.delete(id)){
                numberExemplarysSelected--;
            }
            exDAO = DAOFactory.getInstanceExemplaryDAO();
        }
        return numberExemplarysSelected==0;
    }
    
    private static List<Integer> searchIdExemplarys(int[] positions,JTable jTable){
        List<Integer> ids = new ArrayList<>();
                
        for(int i:positions){
            int id = (int)jTable.getValueAt(i, 0);
            ids.add(id);
        }
        return ids;
    }
    
    public static boolean deleteBook(ViewDeleteBook viewDeleteBook){
        int[] rowsSelected = viewDeleteBook.getjTableBooks().getSelectedRows();
        int numberBooksSelected = rowsSelected.length;
        
        ExemplaryDAO exDAO = DAOFactory.getInstanceExemplaryDAO();
        BookDAO bDAO = DAOFactory.getInstanceBookDAO();
        List<Integer> idBooks = DAODeleteController.searchIdExemplarys(rowsSelected, viewDeleteBook.getjTableBooks());
        
        for(Integer id:idBooks){
            if(exDAO.deleteByBookId(id) && bDAO.delete(id)){
                numberBooksSelected--;
            }
            exDAO = DAOFactory.getInstanceExemplaryDAO();
            bDAO = DAOFactory.getInstanceBookDAO();
        }
        return numberBooksSelected==0;
    }
    
    public static boolean deleteUser(ViewDeleteUser viewDeleteUser){
        int[] rowsSelected = viewDeleteUser.getjTableUsers().getSelectedRows();
        int numberBooksSelected = rowsSelected.length;
        
        UserDAO userDAO = DAOFactory.getInstanceUserDAO();
        List<Integer> idUsers = DAODeleteController.searchIdExemplarys(rowsSelected, viewDeleteUser.getjTableUsers());
        
        for(Integer id:idUsers){
            if(userDAO.delete(id)){
                numberBooksSelected--;
            }
            userDAO = DAOFactory.getInstanceUserDAO();
        }
        
        return numberBooksSelected==0;
    }
 
}
