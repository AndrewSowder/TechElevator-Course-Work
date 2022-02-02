package com.techelevator.farm.shape;

public class Rectangle extends Shape{
    // Instance counter value after the rectangle is created.
    private int instanceNum = 0;

    private int length;

    private int width;

    public Rectangle(int width, int length){
        super("Rectangle");
        this.width = width;
        this.length = length;
        this.instanceNum = Shape.numInstances;
    }

    public int getArea() {
        return width * length;
    }

    protected int getNumInstances(){
        return numInstances;
    }
}
