package com.company;

import com.sun.imageio.spi.RAFImageInputStreamSpi;

public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area=Math.PI*radius*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle: radius="+radius+" area="+area();

    }
}
