/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_7;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        
        System.out.println("Introduceti numar de rinduri si coloane:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sq.squareOfAsterisks(a, b);
    }
}
