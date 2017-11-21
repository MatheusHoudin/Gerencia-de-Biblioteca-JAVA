/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Librarian;
import Model.DAO.LibrarianDAO;
import java.util.List;

/**
 *
 * @author XXXXXX
 */
public class LoginController {
    private static Librarian loggedLibrarian;
    
    public static boolean doLogin(String user,String password){
        Librarian librarianAux = new Librarian(user,password);
        LibrarianDAO librarianDAO = DAOFactory.getInstanceLibrarianDAO();
        List<Librarian> librarians = librarianDAO.findAll();
        
        for(Librarian librarian:librarians){
            if(librarian.equals(librarianAux)){
                loggedLibrarian = librarian;
                return true;
            }
        }
        return false;
    }
}
