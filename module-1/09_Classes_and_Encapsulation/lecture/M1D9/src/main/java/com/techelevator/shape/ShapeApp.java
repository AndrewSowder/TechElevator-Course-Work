package com.techelevator.shape;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setWidth(10);
        System.out.println(rect.getWidth());

        Rectangle rect2 = new Rectangle();

        rect2.setWidth(20);
        System.out.println(rect2.getWidth());

        rect.setHeight(5);
        System.out.println("Area of rect is " + rect.getArea());

        System.out.println("The perimeter of the rect is " + rect.getPerimeter());

        rect.setHeight(15);

        System.out.println("Area of rect is " + rect.getArea());

        System.out.println("The perimeter of the rect is " + rect.getPerimeter());

        Rectangle rect3 = new Rectangle(40,5);
        System.out.println("The area of rect 3 is " + rect3.getArea());

        System.out.println("We've constructed  " + Rectangle.getNumInstances() + " Rectangles");

        int area15x16 = Rectangle.getArea(15,16);
        System.out.println(area15x16);

        rect3.isSquare();

        System.out.println("PI = " + Math.PI);
    }


}
