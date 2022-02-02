package com.techelevator.farm;

public class Cat extends FarmAnimal{

    public Cat() {
        super("Cat", "Meow");
    }

    @Override
    public String getFavoriteFood() {
        return "Fish";
    }

    //@Override // Can no longer override out Abstract baseclass
    //public String getSound(){
      //  return "Meow";
            //}
}
