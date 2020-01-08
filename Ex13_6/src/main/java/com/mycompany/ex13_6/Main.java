/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduceti lungimea list 1: ");
        int a = sc.nextInt();
        System.out.println("Introduceti lungimea list 2: ");
        int b = sc.nextInt();
        ArrayList<Integer> al_1 = new ArrayList<>();
        ArrayList<Integer> al_2 = new ArrayList<>();
        
        System.out.println("Introduceti elemente list 1: ");
        for(int i = 0; i < a; i++){
            al_1.add(sc.nextInt());
        }
        
        System.out.println("Introduceti elemente list 2: ");
        for(int i = 0; i < b; i++){
            al_2.add(sc.nextInt());
        }
        
        intersect(al_1, al_2);
    }
    
    private static void intersect(ArrayList<Integer> al1, ArrayList<Integer> al2){
        ArrayList<Integer> al3 = new ArrayList<>();
        for(int i = 0; i < al1.size(); i++){
            for(int j = 0; j < al2.size(); j++){
                if(al1.get(i) == al2.get(j)){
                    al3.add(al1.get(i));
                }
            }
        }
        System.out.println(al3);
    }
}
