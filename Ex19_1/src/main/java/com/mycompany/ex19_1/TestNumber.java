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
public class TestNumber {
    public static void main(String[] args){
        try{
        Numbers n = new Numbers();
        
            System.out.println(n.divideBy(0));
        }catch(IllegalArgumentException il){
            System.out.println("Error "+il);
        }
    }
}
