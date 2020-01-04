/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_4;



/**
 *
 * @author treba
 */
public class Rectangle {
    
    void calculateArea(float length, float width){
        double s;
        s = length * width;
        System.out.println("Area rectangle: " + s);
    }
    
    void calculatePerimeter(float length, float width){
        double s;
        s = (length + width) * 2;
        System.out.println("Perimeter rectangle: " + s);
    }
}
