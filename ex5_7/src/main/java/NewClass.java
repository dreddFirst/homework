
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
        String s[] = {"MON","TUE","WED","THU","FRI"};
		Scanner sc = new Scanner(System.in);
    	System.out.print("Introduceti zi: ");
    	String a = sc.next();
    	int i;
    	switch(a)
    	{
    		case "MON":
    		{
    			for(i=0; i>=0;i--) {
    				if(i%2==0)
    			System.out.println(s[i]);
    			}
    			break;
    		}
    		case "TUE":
    		case "WED":	
    		{
    			for(i=2; i>=0;i--) {
    				if(i%2==0)
    			System.out.println(s[i]);
    			}
    			break;
    		}
    		case "THU":
    		case "FRI":
    		{
    			for(i=4; i>=0;i--) {
    				if(i%2==0)
    			System.out.println(s[i]);
    			}
    			break;
    		}
    		default : System.out.println("Error"); break;
    	}
    }
}
