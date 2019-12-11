/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_9;

import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Triangle {
    Point p1;
    Point p2;
    Point p3;
    
    public void D(){
        double d1_2 = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
        double d1_3 = Math.sqrt(Math.pow((p3.x - p1.x),2) + Math.pow((p3.y - p1.y),2));
        double d2_3 = Math.sqrt(Math.pow((p3.x - p2.x),2) + Math.pow((p3.y - p2.y),2));
        
        if(d1_2 == d1_3 && d1_2 == d2_3){
            System.out.println("Equilateral!");
        }else if(d1_2 == d1_3 || d1_2 == d2_3 || d1_3 == d2_3){
            System.out.println("Isosceles!");
        }else{
            System.out.println("Right!");
        }
        System.out.println("Distanta p1,p2: " + d1_2);
        System.out.println("Distanta p1,p2: " + d1_3);
        System.out.println("Distanta p1,p2: " + d2_3);
    }
    
    public void P1(int x, int y){
        p1 = new Point(x, y);
    }
    
    public void P2(int x, int y){
        p2 = new Point(x, y);
    }
    
    public void P3(int x, int y){
        p3 = new Point(x, y);
    }
    
}
