/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_5_1;

/**
 *
 * @author treba
 */

import java.util.Scanner;
public class Main {
    
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String name = "";
        int day = 0;
        String month = "";
        Holiday[] h1 = new Holiday[a];
        Holiday h = new Holiday(); 
        Holiday z;
        for(int i = 0; i < a; i++){ 
            name = sc.next();
            day = sc.nextInt();
            month = sc.next();
            z = new Holiday(name, day, month);
            h1[i] = z;
            System.out.println(h1[i]);
        }
        
         /*for(int i = 0; i < a; i++){
             
            h1[i] = (name, day, month);
         } */  
        
        System.out.println(h.avgDate(h1));
    }

    

    
    
    
}
