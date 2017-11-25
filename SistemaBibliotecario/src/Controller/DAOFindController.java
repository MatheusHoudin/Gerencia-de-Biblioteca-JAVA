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
}
