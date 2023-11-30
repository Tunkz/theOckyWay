package com.pluralsight.deli;

import java.util.List;

public class Order implements CostInterface {

    // Lists to store items in the order
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    // Constructor to initialize the order with lists of sandwiches, drinks, and chips
    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
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

    public List<Chips> getChips() {


        return this.chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public void addSandwichToOrder(Sandwich sandwich) {
        this.sandwiches.add(sandwich);

    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                '}';
    }

    public void addDrinkToOrder(Drink drink) {
        this.drinks.add(drink);

    }

    public void addChips(Chips chips) {
       this.chips.add(chips);
    }

    public void orderCheckOut() {

    }

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
