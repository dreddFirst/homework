
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
        int a=1;
        int i=0;
        float s=0;
        Scanner sc = new Scanner(System.in);
        
        while(a != 0)
        {
            System.out.print("Introduceti cifra: ");
            
            a = sc.nextInt();
            s = s + a;
            if(a != 0)
            i++;
        }
         System.out.println("s = "+s);
         System.out.println("Ati introdus "+i+" cifre");
         
         i=0;
         s=0;
         do
         {
             System.out.print("Introduceti cifra: ");
            a = sc.nextInt();
            s = s + a;
            if(a != 0)
            i++;
         }while(a != 0);
         System.out.println("s = "+s);
         System.out.println("Ati introdus "+i+" cifre");
    }
}
