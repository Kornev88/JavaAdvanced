package com.company;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
	Circle c1 = new Circle(10);
	Circle c2 = new Circle(80);
	Square s1 = new Square(6);
	Square s2 = new Square(9);
	Rectangle r1 = new Rectangle(3,3);
	Rectangle r2 = new Rectangle(3,3);

	Shape[] shapes = new Shape[]{c1,c2,s1,s2,r1,r2};

		System.out.println(c1.equals(c2));
		System.out.println(r1.equals(r2));

	for (Shape shape:shapes){
        System.out.println(shape.toString());
    }

    }

}
