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
public class Circle {
    final static double p = 3.14;
    void calculateArea(int i){
        double s;
        s = p * i * i;
        System.out.println("Area circle: " + s);
    }
}
