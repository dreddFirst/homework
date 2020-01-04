
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treba
 */
public class NewClass {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduceti numar de coloane si rinduri: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
