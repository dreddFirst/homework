/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex10_4;
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#00000000.00");
        double radius = sc.nextDouble();
        System.out.println(sphereVolume(radius)+"m");
    }
    
    static double sphereVolume(double radius){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
