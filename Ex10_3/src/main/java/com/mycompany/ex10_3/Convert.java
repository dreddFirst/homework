/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_3;

/**
 *
 * @author treba
 */
public class Convert {
    
    public double convertF(double C){
        return ((C/5)*9)+32;
    }
    public double convertC(double F){
        return ((F-32)/9)*5;
    }
}
