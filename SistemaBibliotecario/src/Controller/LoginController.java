/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Librarian;
import Model.Bean.User;
import Model.DAO.LibrarianDAO;
import Model.DAO.UserDAO;
import java.util.List;

/**
 *
 * @author XXXXXX
 */
public class LoginController {
    public static Librarian loggedLibrarian;
    public static User user;
    
    public static boolean doLogin(String user,String password){
        LibrarianDAO librarianDAO = DAOFactory.getInstanceLibrarianDAO();
        LoginController.loggedLibrarian = librarianDAO.find(user, password);
        
        return LoginController.loggedLibrarian!=null;
    }
    
    public static boolean validateUser(String user,String password){
        UserDAO usd = DAOFactory.getInstanceUserDAO();
        LoginController.user = usd.find(user, password);
        
        return LoginController.user != null;
    }
}
