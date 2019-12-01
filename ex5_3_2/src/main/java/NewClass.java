
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
        Double D;
    Scanner sc = new Scanner(System.in);
    	System.out.print("Vvedite cisla: ");
    	Double a = sc.nextDouble();
    	Double b = sc.nextDouble();
    	Double c = sc.nextDouble();
        System.out.println("Quadratic equations ax^2 + bx + c = 0");
    	D = b*b - 4*a*c;
        System.out.println("Discriminant = "+D);
        Double x1, x2;
    	if(D>0)
        {
            x1 = (-b - Math.sqrt(D))/2*a;
            x2 = (-b + Math.sqrt(D))/2*a;
            System.out.println("Корни уравнения: x1 = "+x1+", x2 = "+x2);
        }
        else if(D == 0)
        {
            Double x;
            x = -b/2*a;
            System.out.println("Уравнение имеет единственный корень: x = "+x);
        }
        else System.out.println("Уравнение не имеет действительных корней!");
    }
}
