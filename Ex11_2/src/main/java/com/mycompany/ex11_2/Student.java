/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_2;

/**
 *
 * @author treba
 */
public class Student {
    private  static String name;
    
    Student(){
        System.out.println("Unknow");
    }
    
    Student(String name){
        this.name = name;
    }
    
    void print(){
        System.out.println(this.name);
    }
}
