package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Order implements CostInterface {

    // Lists to store items in the order
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    // Constructor to initialize the order with lists of sandwiches, drinks, and chips
    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }

    // Getter and setter methods for sandwiches
    public List<Sandwich> getSandwiches() {

        return this.sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }


    // Getter and setter methods for drinks
    public List<Drink> getDrinks() {

        return this.drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    // Getter and setter methods for chips
    public List<Chips> getChips() {


        return this.chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    // Method to add a sandwich to the order
    public void addSandwichToOrder(Sandwich sandwich) {
        this.sandwiches.add(sandwich);

    }

    // Override of the toString method to provide a string representation of the order
    @Override
    public String toString() {
        // StringBuilder potato = new StringBuilder
        // potato.toString


        return "\n" +
                "Sandwiches: "  + "\n" +
                "Drinks = " + drinks + "\n" +
                "Chips = " + chips;
    }

    // Method to add a drink to the order
    public void addDrinkToOrder(Drink drink) {
        this.drinks.add(drink);

    }

    // Method to add chips to the order
    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

    // Method to calculate the total price of the order
    @Override
    public double getPrice() {

        double totalPrice = 0;
        for (int i = 0; i < chips.size(); i++) {
            totalPrice += chips.get(i).getPrice();
        }
        for (int i = 0; i < drinks.size(); i++) {
            totalPrice += drinks.get(i).getPrice();
        }
        for (int i = 0; i < sandwiches.size(); i++) {
            totalPrice += sandwiches.get(i).getPrice();
        }
        return totalPrice;

    }

}
