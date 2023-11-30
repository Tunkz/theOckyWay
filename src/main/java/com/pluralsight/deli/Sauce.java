package com.pluralsight.deli;

public class Sauce extends Topping{
    public Sauce(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " Sauce = ";
    }
}
