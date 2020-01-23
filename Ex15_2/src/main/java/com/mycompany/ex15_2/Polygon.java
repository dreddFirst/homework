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
public abstract class Polygon extends Shape{
    
    protected Point[] vertices;
    
    public void move(int dx, int dy){
        for(Point point : vertices){
            point.move(dx, dy);
        }
    }
    
    @Override
    public double getPerimetr(){
        double perimeter = 0.0;
        for(int index = 0; index < vertices.length-2; index++){
            double distance = vertices[index].distanceTo(vertices[index+1]);
            perimeter += distance;
        }
        
        perimeter += vertices[vertices.length-1].distanceTo(vertices[0]);
        return perimeter;
    }
    
    @Override
    public String toString(){
        return "Polygon: ";
    }
}
