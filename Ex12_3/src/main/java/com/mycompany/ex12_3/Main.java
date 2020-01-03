/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex12_3;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        System.out.println(str1.substring(0, 7).equals(str2.substring(28, 35)));
        System.out.println(str1.substring(9, 15).equals(str2.substring(9, 15)));
    }
}
