/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_3;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);       
        Convert convert = new Convert();
        
        System.out.println("Introduceti temperatura in Celsius:");
        double C = sc.nextDouble();
        String strDouble1 = String.format("%.2f", convert.convertF(C));
        System.out.println("Temperatura in Fahrenheit: " + strDouble1 +"F");
        
        System.out.println("Introduceti temperatura in Fahrenheit:");
        double F = sc.nextDouble();
        String strDouble2 = String.format("%.2f", convert.convertC(F));
        System.out.println("Temperatura in Celsius: " + strDouble2+"C");
    }
    
}
