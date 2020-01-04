/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_5;
import java.util.*;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(integerPower(a,b));
    }
    
    static int integerPower(int a, int b){
        int c = a;
        for(int i = 2; i < b; i++){
            c *=a;
        }
        return c;
    }
}
