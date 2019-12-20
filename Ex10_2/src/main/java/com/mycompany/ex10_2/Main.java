/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_2;
import java.util.*;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Parallelogram pllm = new Parallelogram();
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        System.out.println(pllm.calculatePerimetr(a, (int)c));
        System.out.println(pllm.calculatePerimetr(b));
        System.out.println(pllm.calculateArea(a, c));
        System.out.println(pllm.calculateArea(b));
    }
}
