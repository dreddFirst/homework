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
public class Square extends Rectangle{
    public String toString(){
        return "Square: ";
    }
    
    public Square(Point topRightCorner, int sideLenght){
        super(topRightCorner, sideLenght, sideLenght);
    }
}
