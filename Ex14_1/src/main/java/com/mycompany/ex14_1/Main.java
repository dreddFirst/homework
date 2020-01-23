/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex14_1;


import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf;
        dtf = DateTimeFormatter.ofPattern("DD.MM.YYYY HH:mm:ss");
        System.out.println(date.format(dtf));
        System.out.println(dtf.format(date));
        System.out.println("+2 hours "+ date.plusHours(2).format(dtf));
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2000, 1, 1);
        Period p = Period.of(ld2.getYear(), ld2.getMonthValue(), ld2.getDayOfMonth());
        System.out.println(ld1.minus(p));
        System.out.println(p.between(ld1, ld2));
        System.out.println(date.minusDays(10)+ " "+date.plusDays(10));
        
        LocalDate my_date = LocalDate.of(1984, 03, 31);
        LocalDate azi = LocalDate.now();
        Period virsta = Period.between(azi, my_date);
        System.out.println(virsta);
      
    }
}
