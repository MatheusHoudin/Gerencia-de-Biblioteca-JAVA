
package Model.Bean;

public class Librarian extends People {  
    
     public Librarian(){
        super();
    }

    public Librarian(String user, String password) {
        this.setUser(user);
        this.setPassword(password);
    }
    
    
    public Librarian(String user, String password, String name) {
        this(user,password);
        this.setName(name);
    }
}
