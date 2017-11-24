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
public class Book {
    private int id;
    private String title;
    private String author;
    private String theme;
    private String publishingCompany;
    private int edition;
    
    public Book(){
        super();
    }
    public Book(String title, String author, String theme, String publishingCompany, int edition) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.publishingCompany = publishingCompany;
        this.edition = edition;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Título: "+this.getTitle()+" - Edição: "+this.getEdition(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
