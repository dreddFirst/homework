/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_7;

/**
 *
 * @author treba
 */
public class Square {
    public void squareOfAsterisks(int a, int b){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                System.out.print(" *");                
            }
            System.out.println();
        }
    }
}
