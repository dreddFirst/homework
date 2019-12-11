/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_8;

/**
 *
 * @author treba
 */
public class Point {
    int x;
    int y;
    
    public void quadrant(){
        if(x >= 0 && y >= 0){
            System.out.println("1st Quadrant!");
        }
        
        if(x <= 0 && y >= 0){
            System.out.println("2nd Quadrant!");
        }
        
        if(x <= 0 && y <= 0){
            System.out.println("3rd Quadrant!");
        }
        
        if(x >= 0 && y <= 0){
            System.out.println("4th Quadrant!");
        }
        
        if(x == 0 && y == 0){
            System.out.println("0!");
        }
    }
    
}
