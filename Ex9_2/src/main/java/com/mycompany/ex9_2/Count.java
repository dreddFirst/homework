/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex9_2;

/**
 *
 * @author treba
 */
public class Count {
    private static int counter = 0;
    Count(){
        counter++;        
    }
    
     void print(){
        System.out.println(counter);
    }
}
