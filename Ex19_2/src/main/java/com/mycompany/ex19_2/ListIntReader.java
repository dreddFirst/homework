/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex19_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author treba
 */
public class ListIntReader {
    private List<Integer> li;
    public void reader(){
        
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int a;
            String s = "";
            li = new ArrayList<>();
            for(String st : str.split(",")){
              int i = 0;
            try{
              if(Character.isDigit(st.charAt(i))){
                  
                  li.add(Integer.parseInt(st));
                  
              } 
            }
             catch(Exception e){
                System.out.println(e.toString());
             }
              i++;
            }
        System.out.println(li);
    }
    
    public List<Integer> getList() {
       return li;
   }

}
