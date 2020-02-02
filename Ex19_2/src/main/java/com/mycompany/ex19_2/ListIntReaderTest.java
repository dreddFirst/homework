/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex19_2;

import java.util.List;

/**
 *
 * @author treba
 */
public class ListIntReaderTest {
    public static void main(String[] args){
        int sum = 0;
        ListIntReader lr = new ListIntReader();
        lr.reader();
        List<Integer> li = lr.getList();
        for(int i : li){
            sum += i;
        }
        
        System.out.println("Suma este = " + sum);
    }
}
