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
public class RandomOutTask extends AbstraktTask implements Task{

    public RandomOutTask(int id, LocalDateTime createdAT, LocalDateTime executeAT) {
        super(id, createdAT, executeAT);
    }
    @Override
    public void execute(){
        int random;
        random = (int)(Math.random()*10);
        System.out.println("Random = " + random + "\n" + super.getId() + super.getCreatedAT() + super.getExecuteAT());
    }
}
