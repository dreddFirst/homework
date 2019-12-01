
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
public class Converter 
{
    
    static Double nYears, nDays, minuties;
    
    
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti minute:");
        minuties = sc.nextDouble();
        nYears = minuties/525600; //minute intru-n an
        nDays = minuties/1440;
        System.out.println(minuties+" a number of years = "+nYears);
        System.out.println(minuties+" a number of days = "+nDays);
    }
}
