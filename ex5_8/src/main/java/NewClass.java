
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
public class NewClass 
{
    public static void main(String... str)
    {
        System.out.println("Introduceti operator:");
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println("Introduceti cifre: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c;
        
        switch(s)
        {
            case "*": c = a * b; System.out.println(c+" = "+a+" "+s+" "+b);break;
            case "/": c = a / b; System.out.println(c+" = "+a+" "+s+" "+b);break;
            case "+": c = a + b; System.out.println(c+" = "+a+" "+s+" "+b);break;
            case "-": c = a - b; System.out.println(c+" = "+a+" "+s+" "+b);break;
        }
    }
}