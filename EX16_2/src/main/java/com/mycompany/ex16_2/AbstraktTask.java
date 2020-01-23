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
public class AbstraktTask {
    private int id;
    private LocalDateTime createdAT;
    private LocalDateTime executeAT;

    public AbstraktTask(int id, LocalDateTime createdAT, LocalDateTime executeAT) {
        this.id = id;
        this.createdAT = createdAT;
        this.executeAT = executeAT;    
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCreatedAT() {
        return createdAT;
    }

    public LocalDateTime getExecuteAT() {
        return executeAT;
    }
    
    
    
    public String toString() {
        return "The end";
    } 
}
