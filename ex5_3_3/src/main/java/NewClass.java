
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
        Scanner sc = new Scanner(System.in);
    	System.out.print("Vvedite cisla: ");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
        if(a==b && b==c && a == c)
        {
            System.out.println("equilateral");
        }
        else if(a!= b && a != c && b != c)
        {
            System.out.println("scalene");
        }
        else if(a == b)
        {
            System.out.println("isosceles");
        }
    }
}
