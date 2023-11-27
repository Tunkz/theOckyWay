package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Order implements CostInterface {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public List<Sandwich> getSandwiches() {
        List<Sandwich> sandwiches = new ArrayList<Sandwich>();

        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
       List<Drink> drinks = new ArrayList<Drink>();

        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
       List<Chips> chips = new ArrayList<Chips>();

        return chips;
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
        return 0;
    }
}
