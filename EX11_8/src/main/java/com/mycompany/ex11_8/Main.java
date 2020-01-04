/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_8;

import java.util.Scanner;
import com.mycompany.ex11_8.Date;

/**
 *
 * @author treba
 */
public class Main {
     public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        
        Date.setDay(sc.nextInt());
        Date.setMonth(sc.nextInt());
        Date.setYear(sc.nextInt());
        
        date.displayDate(); 
    }
}
