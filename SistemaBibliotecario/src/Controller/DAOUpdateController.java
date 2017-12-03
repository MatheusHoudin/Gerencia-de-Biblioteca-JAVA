/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.Bean.User;
import Model.DAO.BookDAO;
import Model.DAO.UserDAO;
import View.ViewUpdate.ViewUpdateBook;
import View.ViewUpdate.ViewUpdateUser;

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
}
