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

        String size = "null";
        if (size.equalsIgnoreCase("S")) {
            return 2.00;
        } else if (size.equalsIgnoreCase("M")) {
            return 2.50;
        } else if (size.equalsIgnoreCase("L")) {
            return 3.00;
        }

        return getPrice();
    }

    @Override
    public String toString() {
        return String.format("Drink { size = %s, flavor = %s}", size,flavor );
    }
}
