/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex7_8;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class NewClass {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        Point p = new Point();
        for(;;){
            p.x = sc.nextInt();
            p.y = sc.nextInt();            
            p.quadrant();
            if(p.x == 0 && p.y == 0){
                break;
            }
        }
    }
    
}
