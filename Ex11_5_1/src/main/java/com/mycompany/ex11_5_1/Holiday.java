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
    private String name;
    private String month;
    private int day;
    
    Holiday(String a, int b, String c){
        name = a;
        day = b;
        month = c;
    }
    
    boolean inSameMonth(String str1, String str2){
        boolean b;        
        if(str1.equals(str2)){
            b = true;
        }else{
            b = false;
        }
        return b;
    }
    
    
}
