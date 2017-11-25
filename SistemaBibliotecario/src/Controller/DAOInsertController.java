/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.Bean.Exemplary;
import Model.Bean.Librarian;
import Model.Bean.User;
import Model.DAO.BookDAO;
import Model.DAO.ExemplaryDAO;
import Model.DAO.LibrarianDAO;
import Model.DAO.UserDAO;
import View.ViewRegister.ViewRegisterBook;
import View.ViewRegister.ViewRegisterExemplary;
import View.ViewRegister.ViewRegisterLibrarian;
import View.ViewRegister.ViewRegisterUser;

/**
 *
 * @author XXXXXX
 */
public class DAOInsertController {
   
    
    public static boolean insertExemplarys(ViewRegisterExemplary viewRegisterExemplary){
        
        int numberExemplarys = (int)viewRegisterExemplary.getjSpinnerNumberExemplarys().getValue();
        Book book = (Book)viewRegisterExemplary.getjComboBoxBooks().getSelectedItem();
        
        ExemplaryDAO exemplaryDAO = DAOFactory.getInstanceExemplaryDAO();
        
        Exemplary exemplary = new Exemplary(book.getTitle(), book.getAuthor(), book.getTheme(),
                                            book.getPublishingCompany(), book.getEdition(), book.getId());
        
        for (; numberExemplarys != 0;) {
            System.out.println(exemplary.getId());
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
   
}
