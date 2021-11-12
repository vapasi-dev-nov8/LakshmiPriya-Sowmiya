package com.geometricalshapes;

public class Rectangle  {

    double length;
    double breadth;

    public double area(){

        return length * breadth;

    }

    public double perimeter() {

        return 2*(length + breadth);
    }

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

}
