/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author XXXXXX
 */
public class Lending {
    public static final float PENALITY = (float) 0.35;
    
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

    public boolean isValidToRenovate(){
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(this.lendingDate.toLocalDate(), localDate);
        
        return !(period.getMonths()>=1 || !this.status);
    }
    
    public void calculatePenality(){
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(this.lendingDate.toLocalDate(), localDate);
        int months = period.getMonths();
        int days = period.getDays();
        int years = period.getYears();
        System.out.println("month"+months);
        System.out.println("day"+days);
        System.out.println("year"+years);
        if(months>=1 || years >=1){
            months--;
            this.penality += (days*Lending.PENALITY);
            this.penality += ((months*30)*Lending.PENALITY);
            this.penality += ((years*365)*Lending.PENALITY);
        }
    }
}
