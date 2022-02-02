package com.techelevator.farm.shape;

public abstract class Shape {

    protected static int numInstances = 0;

    private String name;

    public Shape(String name){
        //Increments our Instance counter everytime constructor is used.
        numInstances++;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract int getArea();
}
