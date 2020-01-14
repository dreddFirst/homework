/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> al = new ArrayList<>();
        
        
        System.out.println("Introduceti datele: ");
        for(int i = 0; i < 5; i++){
            al.add(sc.next());
        }
        
        ArrayList <String> al_clone = new ArrayList<String>(al);
        
        al_clone.clear();
        System.out.println("List empty "+ al_clone);
        
        al_clone = new ArrayList<String>(al);
        
        System.out.println("Comparare: ");
        System.out.println(al +"\n"+al_clone);
        System.out.println(al.equals(al_clone));
        
        System.out.println("Introduceti alt element pentru pozitia a 2: ");
        al_clone.set(1,sc.next());
        System.out.println("List modified: " + al_clone);
        
        System.out.println("removePlurals: ");        
        removePlurals(al_clone);
        
        System.out.println("reverse: "); 
        reverse(al);
        
        System.out.println("Comparare: ");
        System.out.println(al +"\n"+al_clone);
        System.out.println(al.equals(al_clone));
    }
    
    private static void removePlurals(ArrayList<String> al_clone1){
        int i = 0;
        
        do{
            String str1 = al_clone1.get(i).toLowerCase();
            if(i < al_clone1.size()){
                if(!str1.endsWith("s")){                   
                      i++; 
                }else{
                    al_clone1.remove(i);                                
                }
            }else{
                break;
            }
             
        }while(i <al_clone1.size());
        System.out.println(al_clone1);
    }
    
    private static void reverse(ArrayList<String> al_clone1){
        StringBuffer str = new StringBuffer();
        ArrayList <String> al_reverse = new ArrayList<String>();
        for(int i =0; i < al_clone1.size(); i++){
            str.append(al_clone1.get(i));
//            str.append(" ");
            al_reverse.add(str.reverse().toString());
            str.delete(0, str.length());
        }
        System.out.println(al_reverse);
    }
            
}
