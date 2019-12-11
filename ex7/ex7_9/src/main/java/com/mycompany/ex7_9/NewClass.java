/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_9;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class NewClass {
    public static void main(String[] str){
        int x;
        int y;        
        Scanner sc = new Scanner(System.in);
        Triangle tri = new Triangle();
        System.out.println("Introduceti coordinate p1: ");
        x = sc.nextInt();
        y = sc.nextInt();        
        tri.P1(x,y);
        
        System.out.println("Introduceti coordinate p2: ");
        x = sc.nextInt();
        y = sc.nextInt();        
        tri.P2(x,y);
        
        System.out.println("Introduceti coordinate p3: ");
        x = sc.nextInt();
        y = sc.nextInt();        
        tri.P3(x,y);
        
        tri.D();
    }
}
