/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_8;

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
        
        System.out.println("Prima metoda standart:");
        sq.squareOfAsterisks(a, b);
        
        System.out.println("Introduceti un caracter:");
        char c = sc.next().charAt(0);
        
        System.out.println("A doua metoda cu suprasarcina de metoda:");
        sq.squareOfAsterisks(a, b, c);
    }
}
