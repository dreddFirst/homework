
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treba
 */

public class FirstPro 
{
    static float C,F,c,f ;
    
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Fahrenheit:");
        F = sc.nextFloat();
        C = (5*(F-32))/9;
        System.out.println("Temperatura in Celsius: "+C+"C");
        System.out.println("Introduceti temperatura in Celsius:");
        C = sc.nextFloat();
        F = (9*C+(32*5))/5;
        System.out.println("Temperatura in Fahrenheit:"+F+"F");   
    }
}
