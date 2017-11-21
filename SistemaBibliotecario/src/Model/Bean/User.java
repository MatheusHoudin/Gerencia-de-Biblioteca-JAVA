/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

/**
 *
 * @author XXXXXX
 */
public class User extends People {
    public User(){
        super();
    }

    public User(String user, String password) {
        this.setUser(user);
        this.setPassword(password);
    }
    
    
    public User(String user, String password, String name) {
        this(user,password);
        this.setName(name);
    }
}
