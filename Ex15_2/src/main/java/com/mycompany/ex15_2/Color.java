/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex15_2;

/**
 *
 * @author treba
 */
public class Color {
    private int r;
private int g;

public int getR() { return r; }
public int getG() { return g; }
public int getB() { return b; } 

public void setR(int r) { this.r = r; }
public void setG(int g) { this.g = g; }
public void setB(int b) { this.b = b; }

private int b; public Color(int r, int g, int b) {
setR(r);
setG(g);
setB(b);
}

public String toString() {
return ("R: " + getR() + " , G: " + getG() + " , B: " + getB());
}
}



