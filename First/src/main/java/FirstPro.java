
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
    
    
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        int aa[] = new int[a];
        for(int i = 0; i < a; i++){
            aa[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean z = true;
        for(int i = 0; i < aa.length-1; i++){
            if((aa[i] == b && aa[i+1] == c)||(aa[i] == c && aa[i+1] == b)){
                        z = false;
                        
            }
        }
        System.out.println(z);
    
    }
}
