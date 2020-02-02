/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author treba
 */
public class Main {
    public static void main(String[] args){
        
        OutTask ot = new OutTask("Method ececute() OutTask class \n",1,LocalDateTime.now(), LocalDateTime.now());
        ot.execute();
        
        RandomOutTask rt = new RandomOutTask(2, LocalDateTime.now(), LocalDateTime.now());
        rt.execute();
        
        CounterOutTask ct = new CounterOutTask(3, LocalDateTime.now(), LocalDateTime.now());
        ct.execute();
        ct.execute();
        ct.execute();
        
        List<Object> l = new ArrayList<>();
        l.add(ot);
        l.add(rt);
        l.add(ct);
        
        
    }
}
