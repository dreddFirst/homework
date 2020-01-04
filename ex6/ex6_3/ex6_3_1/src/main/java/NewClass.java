
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
    public static void main(String... str){
        Scanner sc = new Scanner(System.in);
        int[] arr[];
        int[] arr1[];
        int[] arr2[];
        float suma = 0;
        float av = 0;
        int count_c = 0, count_nc = 0;
        String st = "";
        int n,m;
        int e;
        int id_i = 0, id_j = 0;
        System.out.println("Introduceti marimea arraiului: ");
        n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Introduceti specific value: ");
        e = sc.nextInt();
        System.out.println("Introduceti elemente arraiului: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
                suma += arr[i][j];
                av = suma / (n*n);                
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(e == arr[i][j]){
                    id_i = i;
                    id_j = j;
                    st += e;
                }else{
                    st = "";
                }
            }
        }
        
        System.out.println("Suma = " + suma + "\nAverage value = " + av +
                            "\nSpecific value = " + e + 
                            "\nIndex of an array element: ["+ id_i + "][" + 
                            id_j + "]" + "\nAnother array :");
        
        arr1 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr1[i][j] = arr[i][j];
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j]%2 == 0){
                    count_c ++;
                }else{
                    count_nc ++;
                }
            }
        }
        System.out.println("\nNumber of even integers = "+count_c+
                "\nOdd integers = "+ count_nc);
        
        System.out.println("Introduceti marimea arraiului2: ");
        m = sc.nextInt();
        arr2 = new int[m][m];
        System.out.println("Introduceti elemente arraiului2: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = sc.nextInt();
                //System.out.print(arr1[i][j]+ " ");                
            }
        }
        if(n != m){
            System.out.println("\nTwo arrays are not equal both the length!");
        }
        
        if(n == m){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    if(arr[i][j] == arr2[i][j]){
                        st = "Two arrays are equal absolutely!";
                    }else{
                        st = "Two arrays are not equal on the values!";
                    }
                }
            }
            System.out.println(st);
        }
    }
    
}
