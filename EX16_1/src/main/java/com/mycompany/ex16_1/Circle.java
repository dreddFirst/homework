/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16_1;

import com.mycompany.ex16_1.Point;

/**
 *
 * @author treba
 */
public class Circle implements IMovable{
    private Point point;
    private int radius;

    public Circle(Point center, int radius) {
        this.point = center;
        this.radius = radius;
    }
    
    public String toString(){
        return "";
    }
    
    @Override
    public void moveUp(int distance){
        
        point.setY(point.getY()+distance);
    }
    
    @Override
    public void moveDown(int distance){
        
        point.setY(point.getY()-distance);
    }
    
    @Override
    public void moveRight(int distance){
        point.setX(point.getX()+distance);
    }
    
    @Override
    public void moveLeft(int distance){
        point.setX(point.getX()-distance);
    }
}
