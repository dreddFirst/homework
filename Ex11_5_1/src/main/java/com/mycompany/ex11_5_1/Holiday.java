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
public class Holiday {
    private  String name;
    private  String month;
    private  int day;
    
    Holiday(){}
    
    Holiday(String a, int b, String c){
        this.name = a;
        this.day = b;
        this.month = c;
    }
    
    boolean inSameMonth(Holiday h, Holiday h1){
        return h.month.equals(h1.month);
    }
    
    double avgDate(Holiday h[]){
        double sum = 0;
        for(int i = 0; i < h.length; i++){
            sum += h[i].day;
        }
        return sum/h.length;
    }
    
    
}