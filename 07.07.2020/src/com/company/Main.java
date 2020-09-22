package com.company;

public class Main {

    public static void main(String[] args) {
	Circle c1= new Circle(5);
        Circle c2= new Circle(10);
        Square s1= new Square(5);
        Square s2= new Square(10);
        Rectangle r1 = new Rectangle(5,10);

       Shape[] shapes = new Shape[]{c1,c2,s2,r1,
               new Rectangle(10,3),new Square(8)};


       for (Shape shape:shapes){
           System.out.println(shape);
           System.out.println(shape.area());
       }
    }

}
