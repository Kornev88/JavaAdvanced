package com.company;

public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side=side;
    }
    public double area(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square: side ="+side+" area="+area();
    }
}
