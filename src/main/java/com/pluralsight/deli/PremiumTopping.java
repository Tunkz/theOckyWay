package com.pluralsight.deli;


public class PremiumTopping extends Topping {
    private double price;
    private boolean isMeat;

    public PremiumTopping(String name) {
        super(name);
    }

    @Override
    public double getPrice() {

        return 0;
    }

    public double getPrice(String size) {

        return 0;

    }

    @Override
    public String toString() {
        return "PremiumTopping " +
                "price = " + price +
                ", isMeat = " + isMeat;
    }
}
