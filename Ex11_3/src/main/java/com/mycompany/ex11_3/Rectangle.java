/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_3;

/**
 *
 * @author treba
 */
public class Rectangle {
    static double length;
    static double width;
    
    Rectangle(){
        this(0, 0);
    }
    
    Rectangle(float a, float b){
        length = a;
        width = b;
    }
    
    Rectangle(float a){
        length = a;
        width = a;
    }
    
    private double calcArea(){
        return length * width;
    }
    
    public void print(){
        System.out.println(calcArea());
    }
}
