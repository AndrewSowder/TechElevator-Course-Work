package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal{
    public Pig( ){
        super("Pig", "Oink!", new BigDecimal("10"));
    }

    @Override
    public String getAorAn() {
        return "an";
    }

}
