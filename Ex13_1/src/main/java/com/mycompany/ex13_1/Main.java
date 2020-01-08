/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        ArrayList <String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            al.add(sc.next());
        }
        
        System.out.println("For loop");
        for(int i = 0; i < 5; i++){
            System.out.println(al.get(i));
        }
        
        System.out.println("Enhanced for loop");
        for(String var : al){
            System.out.println(var);
        }
        
        System.out.println("Iterator");
        ListIterator<String> li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        System.out.println("While loop");
        int i = 0;
        while(i < 5){
            System.out.println(al.get(i));
            i++;
        }
    }
}
