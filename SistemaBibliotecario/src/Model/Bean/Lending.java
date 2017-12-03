/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

import java.sql.Date;

/**
 *
 * @author XXXXXX
 */
public class Lending {
    private int id;
    private Exemplary exemplary;
    private User user;
    private Librarian lendingLibrarian;
    private Librarian devolutionLibrarian;
    private float penality;
    private Date lendingDate;
    private Date devolutionDate;
    private boolean status;
    
    public Lending(){
        super();
    }
    public Lending(Exemplary exemplary, User user, Librarian lendingLibrarian, Librarian devolutionLibrarian, float penality, Date lendingDate, Date devolutionDate) {
        this.exemplary = exemplary;
        this.user = user;
        this.lendingLibrarian = lendingLibrarian;
        this.devolutionLibrarian = devolutionLibrarian;
        this.penality = penality;
        this.lendingDate = lendingDate;
        this.devolutionDate = devolutionDate;
        this.setStatus(true);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exemplary getExemplary() {
        return exemplary;
    }

    public void setExemplary(Exemplary exemplary) {
        this.exemplary = exemplary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Librarian getLendingLibrarian() {
        return lendingLibrarian;
    }

    public void setLendingLibrarian(Librarian lendingLibrarian) {
        this.lendingLibrarian = lendingLibrarian;
    }

    public Librarian getDevolutionLibrarian() {
        return devolutionLibrarian;
    }

    public void setDevolutionLibrarian(Librarian devolutionLibrarian) {
        this.devolutionLibrarian = devolutionLibrarian;
    }

    public float getPenality() {
        return penality;
    }

    public void setPenality(float penality) {
        this.penality = penality;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    
    
}
