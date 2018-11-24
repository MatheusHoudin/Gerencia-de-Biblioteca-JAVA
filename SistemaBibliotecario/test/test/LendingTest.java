package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Bean.Lending;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class LendingTest {
    
    @Test
    public void isValidToRenovateWithinOneMonth(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 10, 24)), Date.valueOf(LocalDate.of(2018, 12, 25)));
        
        assertFalse(l.isValidToRenovate());
     
    }
    
    @Test
    public void isValidToRenovateWithLessThanOneMonth(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 10, 25)), Date.valueOf(LocalDate.of(2018, 11, 25)));
        
        assertTrue(l.isValidToRenovate());
    }
    
    @Test
    public void calculatePenalityWithinOneMonthAndTenDays(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 10, 14)), Date.valueOf(LocalDate.of(2019, 1, 2)));
        l.calculatePenality();
        assertEquals(3.5,  l.getPenality(),0);
    }
    
    @Test
    public void calculatePenaltyWithinOneMonth(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 10, 24)), Date.valueOf(LocalDate.of(2019, 1, 2)));
        l.calculatePenality();
        assertEquals(0,  l.getPenality(),0);
    }
    
    @Test
    public void calculatePenaltyWithinLessThanOneMonth(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 10, 23)), Date.valueOf(LocalDate.of(2019, 1, 2)));
        l.calculatePenality();
        assertEquals(0.3499999940395355,  l.getPenality(),0);
    }
    
    @Test
    public void calculatePenaltyWithinTwoMonths(){
        Lending l = new Lending(null, null, null, null, 0, Date.valueOf(LocalDate.of(2018, 8, 24)), Date.valueOf(LocalDate.of(2019, 1, 2)));
        l.calculatePenality();
        assertEquals(21,  l.getPenality(),0);
    }
}
