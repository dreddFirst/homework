/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_8;

/**
 *
 * @author treba
 */
public class Date {
    private static int day;
    private static int month;
    private static int year;

    public static int getDay() {
        return day;
    }

    public static void setDay(int day) {
        if(day <= 0 || day > 31){
            System.out.println("Error: "+day);
            return;
        }else{
            Date.day = day;
        }
    }

    public static int getMonth() {
        return month;
    }

    public static void setMonth(int month) {
         if(month <= 0 || month > 12){
             System.out.println("Error: "+month);
             return;
         }else{
            Date.month = month;
         }
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
         if(year <= 0 ){
             System.out.println("Error: "+year);
             return;
         }else{
            Date.year = year;
         }
    }
    
    
    
    void displayDate(){
                System.out.println(this.day+"/"+this.month+"/"+this.year);
    }
}
