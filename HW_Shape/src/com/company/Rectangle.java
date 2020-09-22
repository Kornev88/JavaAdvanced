package com.company;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public double area(){
        return side1*side2;

    }

    @Override
    public String toString() {
        return "Rectangle: sides: " +
                 side1 +"and"+ side2 +", area = "+area();

    }
}
