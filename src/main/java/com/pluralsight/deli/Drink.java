package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Drink implements CostInterface {

    private String size;
    private String flavor;
    private List<Drink> drinks = new ArrayList<>();

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public Drink(String flavor) {
        this.flavor = flavor;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {


        if (this.size.equalsIgnoreCase("S")) {
            return 2.00;
        } else if (this.size.equalsIgnoreCase("M")) {
            return 2.50;
        }

        return 3.0;
    }

    @Override
    public String toString() {
        return String.format("\nSize " + this.size + ", Flavor " + this.flavor);
    }

    public List<Drink> getDrinks() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("coke"));
        drinks.add(new Drink("sprite"));
        drinks.add(new Drink("fanta"));


        return drinks;
    }
}
