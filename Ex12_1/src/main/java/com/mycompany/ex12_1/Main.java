/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex12_1;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        String s1 = "Let’s go home, it’s late already!";
        System.out.println(s1.charAt(6)+" "+s1.charAt(10));
        System.out.println(s1.contains("home,"));
        System.out.println(s1.endsWith("already!"));
        System.out.println(s1.equals("Let’s go home, it’s late already!"));
        System.out.println(s1.compareToIgnoreCase("go home, it’s late already!"));
    }
    
}
