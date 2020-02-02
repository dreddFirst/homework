/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16_2;

import java.time.LocalDateTime;

/**
 *
 * @author treba
 */
public class CounterOutTask extends AbstraktTask implements Task{
    private int counter = 0;
    public CounterOutTask(int id, LocalDateTime createdAT, LocalDateTime executeAT) {
        super(id, createdAT, executeAT);
    }
    @Override
    public void execute(){
        
        counter ++;
        System.out.println("Executed "+counter + " times" + "\n" + super.getId() + " " + super.getCreatedAT() + " " + super.getExecuteAT());
    }
}
