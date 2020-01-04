/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_2;

/**
 *
 * @author treba
 */
public class Parallelogram {
    int calculatePerimetr(int length, int width){
        return (length+width)*2;
    }
    int calculatePerimetr(int sideLength){
        return sideLength*4;
    }
    
    double calculateArea(int length, double width){
        return length * width;
    }
    int calculateArea(int sideLength){
        return sideLength*sideLength;
    }
}
