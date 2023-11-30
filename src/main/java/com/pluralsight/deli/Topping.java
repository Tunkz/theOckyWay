package com.pluralsight.deli;


public abstract class Topping implements CostInterface{

    /**
     * An abstract class representing a topping that can be added to a sandwich.
     * Subclasses regular toppings and premium toppings are provided as specific implementations for the different type of toppings in the sandwich shop.
     */
    private String name;
        //Constructors for toppings with given name
    public Topping(String name) {
        this.name = name;
    }
        //Default constructor
    public Topping() {
        //Default constructor left empty to be overwritten by child classes
    }
        //Get name of topping
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        //Get name and price of topping
    @Override
    public double getPrice() {
        return 0;
        // The price of topping. subclasses will override method
    }   // returns string of topic

    @Override
    public String toString() {
        return "Topping" +
                "name = " + name ;
    }
}
