package com.techelevator;

import java.awt.*;

public class RectangleWall extends Wall {

    private String name;

    private String color;

    protected static int length;

    protected static int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return length * height;

    }


        public String toString(){
            return getName()  + " (" + length + "x" + height + ") " + "rectangle";
        }
    }


