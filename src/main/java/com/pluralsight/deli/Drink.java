package com.pluralsight.deli;

public class Drink implements CostInterface {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
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
        return String.format("\nSize "+this.size+", Flavor "+this.flavor);
    }
}
