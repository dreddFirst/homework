/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_4;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class NewClass {
    static int i,j;
    public static void main(String... str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti radiusuri:");
        i = sc.nextInt();
        j = sc.nextInt();
        
        Circle cir = new Circle();
        cir.calculateArea(i);
        
        Circle cir1 = new Circle();
        cir1.calculateArea(j);
        
        System.out.println("Introduceti lungimea si latimea:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        Rectangle rec = new Rectangle();
        rec.calculateArea(a, b);
        rec.calculatePerimeter(a, b);
        System.out.println();
    }
}
