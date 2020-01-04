/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_3;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        Rectangle rec1 = new Rectangle();
        rec1.print();
        
        Rectangle rec2 = new Rectangle(a,b);
        rec1.print();
        
        Rectangle rec3 = new Rectangle(a);
        rec1.print();
    }
}
