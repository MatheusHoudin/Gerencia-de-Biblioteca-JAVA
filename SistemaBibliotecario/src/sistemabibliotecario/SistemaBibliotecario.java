/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import Model.Bean.Lending;
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
                Lending l = new Lending(null, null, null, null, Lending.PENALITY,Date.valueOf(LocalDate.of(2018, 10, 14)), Date.valueOf(LocalDate.of(2019, 1, 2)));

        l.calculatePenality();
        System.out.println(l.getPenality());
    }
    
}
