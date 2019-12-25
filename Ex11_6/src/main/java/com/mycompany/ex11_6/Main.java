/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_6;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        Date date = new Date(d,m,y);
        date.displayDate();        
    }
}
