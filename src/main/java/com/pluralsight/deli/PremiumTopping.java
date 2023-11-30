package com.pluralsight.deli;


import java.util.ArrayList;
import java.util.List;

public class PremiumTopping extends Topping {
    private double price;
    private boolean isMeat;
    private List<PremiumTopping> premiumToppings = new ArrayList<>();

    public PremiumTopping(String name) {
        super(name);
    }

    public PremiumTopping() {
        super();
    }

    @Override
    public double getPrice() {

        return 0;
    }

    public double getPrice(String size) {

        return 0;

    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    @Override
    public String toString() {
        return " PremiumTopping " +
                "Meat = " + price +
                ", isMeat = " + isMeat;
    }

    public List<PremiumTopping> getPremiumToppings() {
        premiumToppings.add(new PremiumTopping("steak"));
        premiumToppings.add(new PremiumTopping("ham"));
        premiumToppings.add(new PremiumTopping("salami"));
        premiumToppings.add(new PremiumTopping("roast beef"));
        premiumToppings.add(new PremiumTopping("chicken"));
        premiumToppings.add(new PremiumTopping("bacon"));
        return premiumToppings;
    }
}
