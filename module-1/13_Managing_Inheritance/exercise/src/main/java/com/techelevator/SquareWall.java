package com.techelevator;

public class SquareWall extends RectangleWall {

    private String name;

    private String color;

    private int sideLength;


    public SquareWall(String name, String color, int sideLength) {
        super(name, color, length, height);
        this.sideLength = sideLength;

    }

    @Override
    public int getArea() {
        return sideLength * sideLength;

    }

    public String toString(){
        return getName()  + " (" + sideLength + "x" + sideLength + ") " + "square";
    }
}
