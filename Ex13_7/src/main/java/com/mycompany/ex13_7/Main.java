/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex13_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Employee> al_emp = new ArrayList <>();
        System.out.println("Introduceti numar de lucratori: ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            al_emp.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
        }
        System.out.println("Introduceti id lucratorului: ");
        employee(sc.nextInt(), al_emp);
        
        System.out.println("Introduceti id lucratorului 1: ");
        int b = sc.nextInt();
        
        System.out.println("Introduceti id lucratorului 2: ");
        int c = sc.nextInt();
        
        System.out.println(compare(b,c, al_emp));
    }
    
    private static void employee(int a, ArrayList<Employee> al){
        System.out.println(al.get(a-1).getId()+" "+al.get(a-1).getName()+" "+al.get(a-1).getSalary());
    }
    
    private static boolean compare(int a, int b, ArrayList<Employee> al){
        
        return al.get(a-1).equals(al.get(b-1));
    }
}
