/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_6;

/**
 *
 * @author treba
 */
public class Date {
    static int day;
    static int month;
    static int year;
    
    Date(int a, int b, int c){
        day = a;
        month = b;
        year = c;
        
        
    }
    
    void displayDate(){
        if(day <= 0 || day > 31){
            System.out.println("Error day: "+day);
        }else
            if(month <= 0 || month > 12){
                System.out.println("Error month: "+month);
            }else{
                System.out.println(day+"/"+month+"/"+year);
        }
        
    }
}
