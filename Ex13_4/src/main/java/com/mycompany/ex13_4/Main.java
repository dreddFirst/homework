/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduceti lungimea: ");
        int a = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        
        System.out.println("Introduceti elemente: ");
        for(int i = 0; i < a; i++){
            al.add(sc.next());
        }
        
        markLength4(al);
    }
    
    private static void markLength4(ArrayList<String> al1){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al2 = new ArrayList<>(al1.size());
        for(int i = 0; i < al1.size(); i++){
            if(al1.get(i).length() == 4){
                al2.add(sb.append("****").append(al1.get(i)).toString());
                sb.delete(0, sb.length());
            }else{
                al2.add(al1.get(i));
            }
        }
        System.out.println(al2);
    }
}
