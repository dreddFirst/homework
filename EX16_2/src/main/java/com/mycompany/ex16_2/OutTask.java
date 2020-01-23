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
public class OutTask extends AbstraktTask implements Task{
    
    private String str;
    
    public OutTask(String str, int id, LocalDateTime createdAT, LocalDateTime executeAT) {
        super(id, createdAT, executeAT);
        this.str = str;
    }
    
    @Override
    public void execute(){
        System.out.println(this.str + " " + super.getId() + " " + super.getCreatedAT() + " " + super.getExecuteAT());
    }
}
