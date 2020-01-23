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
public class Triangle extends Polygon{

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        vertices.add(cornerOne);
        vertices.add(cornerTwo);
        vertices.add(cornerThree);
    }
}
