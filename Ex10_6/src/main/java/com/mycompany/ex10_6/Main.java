/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_6;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Multiple mul = new Multiple();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti cifrele pentru comporatie:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Al doilea numar este un multiplu al primului?");
        System.out.println(mul.isMultiple(a, b));
    }
    
}
