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
public class Exemplary extends Book{
    private boolean avaliable;
    private int idExemplary;
    
    public Exemplary(String title, String author, String theme, String publishingCompany, int edition,int idBook) {
        super(title, author, theme, publishingCompany, edition);
        this.setId(idBook);
        this.setAvaliable(true);
    }


    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public int getIdExemplary() {
        return idExemplary;
    }

    public void setIdExemplary(int idExemplary) {
        this.idExemplary = idExemplary;
    }
    
    
}
