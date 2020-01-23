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
public class Rectangle extends Polygon{
    
    public Rectangle(Point topRightCorner, int width, int height){
        Point topLeftCorner = new Point(topRightCorner.getX()-width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topLeftCorner.getX(), topLeftCorner.getY()-height);
        Point bottomRightCorner = new Point(bottomLeftCorner.getX()+width, bottomLeftCorner.getY());
        
        vertices = new Point[4];
        vertices[0] = topRightCorner;
        vertices[1] = topLeftCorner;
        vertices[2] = bottomLeftCorner;
        vertices[3] = bottomRightCorner;
    }
    
    @Override
    public double getSurface(){
        double width = vertices[1].distanceTo(vertices[0]);
        double height = vertices[0].distanceTo(vertices[3]);
      return width * height;
    }
    
    @Override
    public double getPerimetr(){
        return super.getPerimetr();
    }
    
    @Override
    public String toString(){
        return "Rectangle: ";
    }

    @Override
    public void move(double dx, double dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
