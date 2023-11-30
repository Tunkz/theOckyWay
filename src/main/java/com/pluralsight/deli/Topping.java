package com.pluralsight.deli;

public abstract class Topping implements CostInterface{
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public Topping() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Topping" +
                "name = " + name ;
    }
}
