package com.pluralsight.deli;

public class RegularToppings extends Topping{
    public RegularToppings(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " RegularToppings = ";
    }
}
