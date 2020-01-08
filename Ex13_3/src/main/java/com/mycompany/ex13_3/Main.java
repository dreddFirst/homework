/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> al = new ArrayList<>();
        int i = 0;
        System.out.println("Introduceti lungimea listului: ");
        int a = sc.nextInt();
        System.out.println("Introduceti datele: ");
        while(i< a){
            al.add(sc.next());
            i++;
        }
//        
        pairs(al, a);
    }
    
    /**
     *
     * @param al1
     */
    public static void pairs(ArrayList<String> al1, int a){
        ArrayList <String> al_clone = new ArrayList<>(a);
       int b;
       if(a%2 == 0){
           b = a;
           for(int i = 0; i < b; i +=2){
                al_clone.add(i, al1.get(i+1)); 
                al_clone.add(i+1, al1.get(i));
            }
       }else{
           b = a;
           for(int i = 0; i < b-1; i +=2){
                al_clone.add(i, al1.get(i+1)); 
                al_clone.add(i+1, al1.get(i));
            }
           al_clone.add(b-1, al1.get(b-1));
       }
        
        System.out.println(al_clone.toString());
    }
}
