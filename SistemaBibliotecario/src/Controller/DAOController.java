/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.DAO.BookDAO;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

/**
 *
 * @author XXXXXX
 */
public class DAOController {
    
    public static void fillJComboBoxBooks(JComboBox jCombo){
        BookDAO bookDao = DAOFactory.getInstanceBookDAO();
        for(Book b:bookDao.findAll()){
            jCombo.addItem(b.getTitle());
        }
    }
    
    public static void insertExemplarys(JSpinner jsnNumberExemplarys,JComboBox jcb){
        int numberExemplarys = (int)jsnNumberExemplarys.getValue();
        String nameBook = (String)jcb.getSelectedItem();
        
    }
}
