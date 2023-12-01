package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Sauce extends Topping {
    private List<Sauce> Sauce = new ArrayList<>();
    public Sauce(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return " Sauce = ";

    }

    public List<Sauce> getSauce() {
        Sauce.add(new Sauce("Mayonnaise"));
        Sauce.add(new Sauce("Ketchup"));
        Sauce.add(new Sauce("Ranch"));
        Sauce.add(new Sauce("BBQ"));
        Sauce.add(new Sauce("Mustard"));
        Sauce.add(new Sauce("Thousand islands"));
        Sauce.add(new Sauce("Vinaigrette"));
        return Sauce;
    }

}
