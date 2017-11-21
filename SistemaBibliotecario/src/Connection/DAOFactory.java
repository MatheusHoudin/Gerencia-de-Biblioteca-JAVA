/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Model.DAO.BookDAO;
import Model.DAO.LibrarianDAO;

/**
 *
 * @author XXXXXX
 */
public class DAOFactory {
    private static BookDAO bookDAO;
    private static LibrarianDAO librarianDAO;
    
    public static BookDAO getInstanceBookDAO(){
        if(DAOFactory.bookDAO==null){
           DAOFactory.bookDAO = BookDAO.getInstance();
        }
        DAOFactory.bookDAO.setConnection(ConnectionFactory.getConnection());
        return DAOFactory.bookDAO;
    }
    
    public static LibrarianDAO getInstanceLibrarianDAO(){
        if(DAOFactory.librarianDAO==null){
            DAOFactory.librarianDAO = LibrarianDAO.getInstance();
        }
        DAOFactory.librarianDAO.setConnection(ConnectionFactory.getConnection());
        return DAOFactory.librarianDAO;
    }
}
