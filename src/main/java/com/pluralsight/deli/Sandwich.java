package com.pluralsight.deli;

import java.util.List;

public class Sandwich implements CostInterface {
    private int size;
    private String breadType;
    private List<Topping> toppings;
    private boolean toasted;
    private boolean extraCheese;

    public Sandwich(int size, String breadType, List<Topping> toppings, boolean toasted, boolean extraCheese) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
        this.extraCheese = extraCheese;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
