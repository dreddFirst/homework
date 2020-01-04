/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_4;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        endAppend();
        String str1 = "moon#night";
        String str3 = "welcome";
        StringBuilder str2 = new StringBuilder("bat##ball");
        System.out.println("12.4.2 = " + isSame(str1));
        System.out.println("12.4.2 = "+isSame(str2));
        System.out.println(charDublicate(str3));
        System.out.println(str1.charAt(3));
    }
    
    static void endAppend(){
        String str1 = "Dredd";
        StringBuilder str2 = new StringBuilder("Hello ");
        System.out.println("12.4.1 = "+str2.append(str1));
    }
    
    static boolean isSame(String str){
        int i = str.indexOf('#');
        if(i > -1 && i < str.length()-1){
        char c1 = str.charAt(i-1);
        char c2 = str.charAt(i+1);
        return c1 == c2;
        }
        return false;
    }
    
    static boolean isSame(StringBuilder str){
        int i = str.indexOf("#");
        
        StringBuilder sb = new StringBuilder(str); 
        if(i > -1 && i+1 < str.length()-1){
        char c1 = sb.charAt(i-1);
        char c2 = sb.charAt(i+2);
        return c1 == c2;
        }else{
        return false;
        }
    }
    
    static String charDublicate(String str){
        char c;
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            str1 = str1 + c + c; 
        }
        return str1;
    }
}