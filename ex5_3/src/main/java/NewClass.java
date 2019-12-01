
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
    static String d;
    public static void main(String... str)
    {
    Scanner sc = new Scanner(System.in);
    	System.out.print("Vvedite cisla: ");
    	int a = sc.nextInt();
    	
    	if(a<0)    		
    	{
    		System.out.println("Number is negative ");
    	}
    	else 
    	{
    		System.out.println("Number is positive");
    	}
    	
    	
    	 d = (a<0)? "Number is negative":"Number is positive";
    	System.out.println(d);
    }
}
