/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex19_1;

/**
 *
 * @author treba
 */
public class Numbers {
    int number;
    
    public int divideBy(int i){
        this.number = i;
        return this.number /= i;
    }
}
