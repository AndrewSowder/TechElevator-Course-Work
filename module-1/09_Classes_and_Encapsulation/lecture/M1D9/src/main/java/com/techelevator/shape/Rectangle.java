package com.techelevator.shape;

public class Rectangle {

    public static final String Shape_Name = "Retcangle";
     //Static share across all instance of Rectangle.
    private static int numInstances;

    //Instance Variables, created for each instance of Rectangle.
    private int width;
    private int height;
    private String label;

    //Constructors
    public Rectangle() {
        //System.out.println("Default constructing a rectangle");
        //numInstances++;
        this(0,0);
        //CallS Rectangle Constructor using int 0, int 0.

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        numInstances++;
    }

    public void setWidth(int width) {
            this.width = width;

    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return this.getWidth() * this.getHeight();

    }

    public int getPerimeter() {
        return (this.getWidth() * 2) + (this.getHeight() * 2);
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public static int getNumInstances() {
        return numInstances;

    }

    public static int getArea(int width, int height) {
        return width * height;
    }

}
