/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex15_2;

import com.mycompany.ex15_2.Color;

/**
 *
 * @author treba
 */
public abstract class Shape {
    protected Color color;

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract void move(double dx, double dy);
    
    public abstract double getSurface();
    
    public abstract double getPerimetr();
}
