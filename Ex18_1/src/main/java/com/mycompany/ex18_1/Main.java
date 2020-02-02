/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex18_1;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Predicate pred = (a) ->{
            if(a>0) return "Greater than zero"; 
            else if(a<0) return "Less than zero";
            else return "Equal to zero";
        };
        Predicate pred1 = ( a) ->{
            if(a%2==0) return "Even";
            else return "odd";
        };
        System.out.println(pred.result( 3));
        System.out.println(pred1.result( 4));
    }
}
