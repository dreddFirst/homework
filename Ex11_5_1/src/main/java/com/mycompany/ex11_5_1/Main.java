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
        
        
        Holiday h1 = new Holiday("idependence",4,"may");
        Holiday h2 = new Holiday("new year", 31, "may");
        Holiday h = new Holiday();
        Holiday h3[] = {h1,h2};
        
        System.out.println(h2.inSameMonth(h1,h2));
        System.out.println(h.avgDate(h3));
    }

    

    
    
    
}
