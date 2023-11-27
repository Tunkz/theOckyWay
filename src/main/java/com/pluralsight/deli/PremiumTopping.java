package com.pluralsight.deli;

public class PremiumTopping extends Topping{
    private double price;

    public PremiumTopping(String name) {
        super(name);

    }

    @Override
    public double getPrice() {
        return price;
    }
}
