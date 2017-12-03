/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.sql.Date;

/**
 *
 * @author XXXXXX
 */
public class SistemaBibliotecario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(System.currentTimeMillis());
        LocalDate l = LocalDate.now();
        LocalDate l2 = LocalDate.of(2017, 10, 2);
        
        Period periodo = Period.between(l2, l);
        
        java.sql.Date dt = new java.sql.Date(System.currentTimeMillis());
        System.out.println("aa "+dt);
        System.out.printf("%s anos, %s mês e %s dias", 
  periodo.getYears() , periodo.getMonths(), periodo.getDays());
        System.out.println(l);
        
    }
    
}
