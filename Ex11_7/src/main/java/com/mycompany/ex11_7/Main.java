/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex11_7;

import java.util.Scanner;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        Invoice in = new Invoice();
        Invoice in1 = new Invoice(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
        in.setPartDescription(sc.next());
        in.setPartNumber(sc.next());
        in.setPrice(sc.nextDouble());
        in.setQuantity(sc.nextInt());
        System.out.println(in1.getInvoiceAmount());
        System.out.println(in.getInvoiceAmount());
        
    }
}
