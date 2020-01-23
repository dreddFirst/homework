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
public class Point {
    private double x;
private double y;
public double getX() { return x; }
public double getY() { return y; }
public void move(double dx, double dy) {
setX(getX() + dx);
setY(getY() + dy);
}
public void setX(double x) { this.x = x; }
public void setY(double y) { this.y = y; }

public double distanceTo(Point point){
    return Math.sqrt(Math.pow(point.getX()-this.x,2)+Math.pow(point.getY()-this.y,2));
}

public void display() {
System.out.println("< " + getX() + " ; " + getY() + " >");
}
public Point(double x, double y) {
setX(x);
setY(y);
}
public boolean isAtSamePosition(Point p) {
return ((p.getX() == this.getX()) && (p.getY() == this.getY()));
}
public Point(double n) {
this(n, n);
}

public Point() {
this(0, 0);
}

public Point(Point p) {
this(p.getX(), p.getY());
}

public String toString() {
return ("< " + getX() + " ; " + getY() + " >");
}

}
