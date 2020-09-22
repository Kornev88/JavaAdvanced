package com.company;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    public double area(){
        return sideB*sideA;
    }

    @Override
    public String toString() {
        return "Rectangle: side +"+sideA +sideB;

    }
}
