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
import Model.Bean.Librarian;
import Model.Bean.User;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import Model.DAO.LendingDAO;
import Model.DAO.LibrarianDAO;
import Model.DAO.UserDAO;
import View.ViewRegister.ViewDoLending;
import View.ViewRegister.ViewRegisterBook;
import View.ViewRegister.ViewRegisterExemplary;
import View.ViewRegister.ViewRegisterLibrarian;
import View.ViewRegister.ViewRegisterUser;
import java.sql.Date;

/**
 *
 * @author XXXXXX
 */
public class DAORegisterController {
   
    
    public static boolean insertExemplarys(ViewRegisterExemplary viewRegisterExemplary){
        
        int numberExemplarys = (int)viewRegisterExemplary.getjSpinnerNumberExemplarys().getValue();
        Book book = (Book)viewRegisterExemplary.getjComboBoxBooks().getSelectedItem();
        
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        Exemplary exemplary = new Exemplary(book.getTitle(), book.getAuthor(), book.getTheme(),
                                            book.getPublishingCompany(), book.getEdition(), book.getId());
        
        for (; numberExemplarys != 0;) {
            if(exemplaryDAO.insert(exemplary)){
                numberExemplarys--;
            }
            exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        }
        return numberExemplarys==0;
    }
    
    public static boolean insertUser(ViewRegisterUser viewRegisterUser){
        
        String name = viewRegisterUser.getTxtNameUser().getText();
        String user = viewRegisterUser.getTxtUserUser().getText();
        String password = new String(viewRegisterUser.getTxtPasswordUser().getPassword());
        
        User use = new User(user,password,name);
        UserDAO userDAO = DAOFactory.getInstanceUserDAO();
        return userDAO.insert(use);
    }
    
    public static boolean insertBook(ViewRegisterBook viewRegisterBook){
        
        String author = viewRegisterBook.getTxtAuthor().getText();
        String publishingCompany = viewRegisterBook.getTxtPublishingCompany().getText();
        String theme = viewRegisterBook.getTxtTheme().getText();
        String title = viewRegisterBook.getTxtTitle().getText();
        int edition = (int)viewRegisterBook.getjSpinnerEdition().getValue();
        
        Book book = new Book(title,author,theme,publishingCompany,edition);
        BookDAO bookDAO = DAOFactory.getInstanceBookDAO();
        
        return bookDAO.insert(book);
    }
    
    public static boolean insertLibrarian(ViewRegisterLibrarian viewRegisterLibrarian){
        String name = viewRegisterLibrarian.getTxtName().getText();
        String user = viewRegisterLibrarian.getTxtUser().getText();
        String password = new String(viewRegisterLibrarian.getTxtPassword().getPassword());
        
        Librarian lib = new Librarian(user,password,name);
        LibrarianDAO libDAO = DAOFactory.getInstanceLibrarianDAO();
        
        return libDAO.insert(lib);
    }
    
    public static boolean insertLending(ViewDoLending viewDoLending){
        int selectedRow = viewDoLending.getjTableExemplarys().getSelectedRow();
        User user = LoginController.user;
        Librarian librarian = LoginController.loggedLibrarian;
        Exemplary exemplary;
        Date lendingDate = new Date(System.currentTimeMillis());
        
        LendingDAO lendingDAO = DAOFactory.getInstanceLendingDAO();
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        exemplary = exemplaryDAO.findExemplary((int) viewDoLending.getjTableExemplarys().getValueAt(selectedRow, 0));
        
        if(exemplary.isAvaliable() && lendingDAO.validateLending(user.getId(), exemplary.getId())){
            lendingDAO = DAOFactory.getInstanceLendingDAO();
            exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
            exemplaryDAO.updateAvailability(exemplary.getIdExemplary(), false);

            Lending lending = new Lending();
            lending.setStatus(true);
            lending.setUser(user);
            lending.setExemplary(exemplary);
            lending.setLendingLibrarian(librarian);
            lending.setLendingDate(lendingDate);

            return lendingDAO.registerLending(lending);
        }
        return false;
    }
    
    
}
