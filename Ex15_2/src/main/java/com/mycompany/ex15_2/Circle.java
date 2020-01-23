/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex15_2;

import com.mycompany.ex15_2.Point;

/**
 *
 * @author treba
 */
public class Circle extends Shape{
    private Point center;
    private double radius;

    public Circle(Point point, double radius) {
        this.center = point;
        this.radius = radius;
    }
    
   
    public double getDiameter(){
        return 2 * radius;
    }
    
    @Override
    public void move(double dx, double dy){
//        center.setX(center.getX()+dx);
//        center.setY(center.getY()+dy);

          center.move(dx, dy);
    }
    
    public double getSurface(){
       return Math.PI * Math.pow(2, radius);
    }
    
    public double getPerimetr(){
        return 2 * Math.PI * radius;
    }
    
    public String toString(){
        return " Circle: ";
    }
}
