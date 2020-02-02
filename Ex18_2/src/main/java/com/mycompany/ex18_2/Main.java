/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex18_2;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        Face face = (str) ->{
          if(str.contains("knowledge")) return "Contains the string \"knowledge\""; 
          else return "No";
        };
        
        Face face1 = (str) ->{
            if(str.length() > 10) 
              return "Has a length greater than 10";
          else return "Has a length less than 10";
        };
        
        Face face2 = (str) ->{
            if(str == null) return "Is null";
            else return "Is not null";
        };
        
        Face face3 = (str) ->{
            for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){ return "Is not a String full of empty spaces";}
            else return "Is a String full of empty spaces";
            }
            return "";
        };
        
        System.out.println(face.string("Dreddfsdf gdfgdfg knowledge"));
        System.out.println(face1.string("dfsdfdfdf ioiuif"));
        System.out.println(face2.string(null));
        System.out.println(face3.string("      "));
    }
}
