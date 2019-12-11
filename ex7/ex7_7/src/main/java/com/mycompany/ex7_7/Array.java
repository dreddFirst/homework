/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_7;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Array {
    static int[] items;
    
    public  void allCalculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti marimea array-ului: ");
        int a = sc.nextInt();
        items = new int[a];
        System.out.println("Introduceti elemente: ");
        for(int i = 0; i < a; i++){
            items[i] = sc.nextInt();
        }
        sum();
        average();
        even();
        odd();
        length();
    }
    
    private static double sum(){
        double sum = 0;
        for(int i = 0; i < items.length; i++){
            sum += items[i];
        }
        return sum;
    }
    private static double average(){
        double avr;
        avr = sum()/items.length;
        return avr;
    }
    
    private static void even(){
        System.out.println("Even number: ");
        for(int i = 0; i < items.length; i++){
            if(items[i]%2 == 0){
                System.out.println(items[i]);
            }else{
                continue;
            }
        }
    }
    
    private static void odd(){
        System.out.println("Odd number: ");
        for(int i = 0; i < items.length; i++){
            if(items[i]%2 != 0){
                System.out.println(items[i]);
            }else{
                continue;
            }
        }
    }
    
    private static void length(){
        System.out.println("Length of the array: ");
        System.out.println(items.length);
    }
}
