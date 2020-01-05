/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_5;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("welllcommmmeee");
        System.out.println(repeatChar(str));
        
        System.out.println("12.5.2 = "+strReplace("it is a string"));
        
        String sb = "ab5c2d4ef12s";
        System.out.println("12.5.3 = "+sumNumbers(sb));
        
    }
    
    static int repeatChar(StringBuilder str){
        int n = 0;
        int count = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                if(str.charAt(i+1)==str.charAt(i+2)){
                    n++;
                }
            }
        }
        return n;
    }
    
    static String strReplace(String str){
        String str1 = str.replace("is", "is not");
        return str1;
    }
    
    static double sumNumbers(String str){
        
        String str1 = "";
        double sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                str1 += str.charAt(i);
            }
        }
        int b = Integer.parseInt(str1);
        
        for(int i = 0; i < str1.length(); i++){
            sum += (b%10);
            b /= 10;
        }
        return sum;
    }
    
}
