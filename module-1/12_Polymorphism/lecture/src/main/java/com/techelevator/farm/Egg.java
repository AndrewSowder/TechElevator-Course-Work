package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable {

    private BigDecimal price = new BigDecimal("0.35");

    private String name = "Egg";

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;

    }
}
