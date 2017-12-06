/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.Bean.Exemplary;
import Model.Bean.User;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import Model.DAO.LendingDAO;
import Model.DAO.UserDAO;
import View.ViewRegister.ViewDoDevolution;
import View.ViewUpdate.ViewUpdateBook;
import View.ViewUpdate.ViewUpdateLending;
import View.ViewUpdate.ViewUpdateUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author XXXXXX
 */
public class DAOUpdateController {
    
    public static boolean updateUser(ViewUpdateUser viewUpdateUser){
        int selectedRow = viewUpdateUser.getjTableUsers().getSelectedRow();
        User user = new User();
        user.setId((int) viewUpdateUser.getjTableUsers().getValueAt(selectedRow, 0));
        user.setName(viewUpdateUser.getTxtName().getText());
        user.setUser(viewUpdateUser.getTxtUser().getText());
        user.setPassword(viewUpdateUser.getTxtPassword().getText());
        
        UserDAO userDao = DAOFactory.getInstanceUserDAO();
        
        return userDao.update(user);
    }
    
    public static boolean updateBook(ViewUpdateBook viewUpdateBook){
        int selectedRow = viewUpdateBook.getjTableBooks().getSelectedRow();
        Book book = new Book();
        book.setId((int) viewUpdateBook.getjTableBooks().getValueAt(selectedRow, 0));
        book.setTitle(viewUpdateBook.getTxtTitle().getText());
        book.setAuthor(viewUpdateBook.getTxtAuthor().getText());
        book.setTheme(viewUpdateBook.getTxtTheme().getText());
        book.setPublishingCompany(viewUpdateBook.getTxtPublishingCompany().getText());
        book.setEdition((int) viewUpdateBook.getjSpinnerEdition().getValue());
        
        BookDAO bookDao = DAOFactory.getInstanceBookDAO();
        
        return bookDao.update(book);
    }
    
    public static boolean updateLending(ViewUpdateLending viewUpdateLending){
        int[] selectedRows = viewUpdateLending.getjTableLendings().getSelectedRows();
        int numberSelectedLendings = selectedRows.length;
        
        LendingDAO lenDAO = DAOFactory.getInstanceLendingDAO();
        List<Integer> listIds = DAOUpdateController.searchIdLendings(selectedRows, viewUpdateLending.getjTableLendings());
        
        for(Integer id:listIds){
            if(lenDAO.update(id)){
                numberSelectedLendings--;
            }
            lenDAO = DAOFactory.getInstanceLendingDAO();
        }
        
        return numberSelectedLendings==0;
    }
    
    public static boolean doDevolution(ViewDoDevolution viewDoDevolution){
        int[] selectedRows = viewDoDevolution.getjTableLendings().getSelectedRows();
        int numberSelectedLendings = selectedRows.length;
        
        LendingDAO lenDAO = DAOFactory.getInstanceLendingDAO();
        List<Integer> listIds = DAOUpdateController.searchIdLendings(selectedRows, viewDoDevolution.getjTableLendings());
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        Exemplary exemplary;
        int cont = 0;
        for(Integer id:listIds){
            if(lenDAO.devolution(id)){
                numberSelectedLendings--;
            }
            lenDAO = DAOFactory.getInstanceLendingDAO();
        }
        for(int i:selectedRows){
            exemplary = exemplaryDAO.findExemplary((int) viewDoDevolution.getjTableLendings().getValueAt(i, 3));
            exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
            exemplaryDAO.updateAvailability(exemplary.getIdExemplary(), true);
            exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        }
        return numberSelectedLendings==0;
    }
    
    private static List<Integer> searchIdLendings(int[] positions,JTable jTable){
        List<Integer> ids = new ArrayList<>();
                
        for(int i:positions){
            int id = (int)jTable.getValueAt(i, 0);
            ids.add(id);
        }
        return ids;
    }
}
