package com.pluralsight.deli;


import java.util.ArrayList;
import java.util.List;

public class PremiumTopping extends Topping {
    private double price;
    private boolean isMeat;
    private List<PremiumTopping> premiumToppings = new ArrayList<>();

    public PremiumTopping(String name, Boolean isMeat) {
        super(name);
        this.isMeat = isMeat;
    }

    public PremiumTopping() {
        super();
    }

    @Override
    public double getPrice() {

        return 0;
    }

    public double getPrice(String size) {

        double price = 0;
        if (size.equalsIgnoreCase("4")) {
            price += this.isMeat ? 1 : .75;
        } else if (size.equalsIgnoreCase("8")) {
            price += this.isMeat ? 2 : 1.5;
        } else {
            price += this.isMeat ? 3 : 2.25;

        }
        return price;
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
        premiumToppings.add(new PremiumTopping("steak", true));
        premiumToppings.add(new PremiumTopping("ham", true));
        premiumToppings.add(new PremiumTopping("salami", true));
        premiumToppings.add(new PremiumTopping("roast beef", true));
        premiumToppings.add(new PremiumTopping("chicken", true));
        premiumToppings.add(new PremiumTopping("bacon", true));
        return premiumToppings;
    }

    public List<PremiumTopping> getCheesePremiumTopping() {
        List<PremiumTopping> Cheese= new ArrayList<>();
        Cheese.add(new PremiumTopping("american",false));
        Cheese.add(new PremiumTopping("provolone",false));
        Cheese.add(new PremiumTopping("cheddar",false));
        Cheese.add(new PremiumTopping("swiss",false));


        return Cheese;
    }
}
