package com.company;

import java.util.Objects;

public class Square extends Shape {
    private double side;
    private double area;


    public Square(double side) {
        this.side = side;
        this.area = side*side;
    }
    public double area(){
        return  area;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side=" + side +
                ", area=" + area;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Double.compare(square.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, area);
    }
}
