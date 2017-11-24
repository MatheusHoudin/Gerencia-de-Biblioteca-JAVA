/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.Bean.Exemplary;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import View.ViewRegister.ViewRegisterExemplary;
import javax.swing.JComboBox;

/**
 *
 * @author XXXXXX
 */
public class DAOController {
    
    public static void fillJComboBoxBooks(JComboBox jCombo){
        BookDAO bookDao = DAOFactory.getInstanceBookDAO();
        for(Book b:bookDao.findAll()){
            jCombo.addItem(b);
        }
    }
    
    public static void insertExemplarys(ViewRegisterExemplary viewRegisterExemplary){
        
        int numberExemplarys = (int)viewRegisterExemplary.getjSpinnerNumberExemplarys().getValue();
        Book book = (Book)viewRegisterExemplary.getjComboBoxBooks().getSelectedItem();
        
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        Exemplary exemplary = new Exemplary(book.getTitle(), book.getAuthor(), book.getTheme(),
                                            book.getPublishingCompany(), book.getEdition(), book.getId());

        for (; numberExemplarys != 0; numberExemplarys--) {
            System.out.println(exemplary.getId());
            exemplaryDAO.insert(exemplary);
            exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();

            System.out.println("inserido");
        }
        
    }
}
