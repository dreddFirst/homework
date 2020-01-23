/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex16_1;

import com.mycompany.ex16_1.Point;
import java.util.Arrays;

/**
 *
 * @author treba
 */
public class Rectangle extends Polygon{

    public Rectangle(Point topRightCorner, int width, int leight) {
        Point topLeftCorner = new Point(topRightCorner.getX()-width, topRightCorner.getY());
        Point bottomLeftCorner = new Point(topLeftCorner.getX(), topLeftCorner.getY()-leight);
        Point bottomRightCorner = new Point(bottomLeftCorner.getX()+width, bottomLeftCorner.getY());
        
        vertices.add(topRightCorner);
        vertices.add(bottomRightCorner);
        vertices.add(bottomLeftCorner);
        vertices.add(topLeftCorner);
    }
}
