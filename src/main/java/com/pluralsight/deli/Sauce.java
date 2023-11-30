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
        Sauce.add(new Sauce("mayonnaise"));
        Sauce.add(new Sauce("ketchup"));
        Sauce.add(new Sauce("ranch"));
        Sauce.add(new Sauce("BBQ"));
        Sauce.add(new Sauce("mustard"));
        Sauce.add(new Sauce("thousand islands"));
        Sauce.add(new Sauce("vinaigrette"));
        return Sauce;
    }

}
