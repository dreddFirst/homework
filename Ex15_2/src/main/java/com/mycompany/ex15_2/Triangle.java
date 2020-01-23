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
public class Triangle extends Polygon{

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        vertices = new Point[3];
        vertices[0] = cornerOne;
        vertices[1] = cornerTwo;
        vertices[2] = cornerThree;
                
    }
    
    @Override
    public String toString(){
        return "Triangle: ";
    }
    
    public double getSurface(){
            
    }
    
    public boolean isRight(){
        double l1 = vertices[0].distanceTo(vertices[1]);
        double l2 = vertices[1].distanceTo(vertices[2]);
        double l3 = vertices[2].distanceTo(vertices[0]);
        
        return l2 == l3 && l3 == l1 && l1 == l2;
    }
    
    public boolean isEquilateral(){
        double l1 = vertices[0].distanceTo(vertices[1]);
        double l2 = vertices[1].distanceTo(vertices[2]);
        double l3 = vertices[2].distanceTo(vertices[0]);
        
        return l2 == l3 && l3 == l1 || l1 == l2;
    }
    
    public boolean isIsosceles(){
        
    }
    
}
