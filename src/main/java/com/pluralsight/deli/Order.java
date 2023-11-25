package com.pluralsight.deli;

import java.util.List;

public class Order implements CostInterface{

   private List<Sandwich> sandwiches;
   private List<Drink> drinks;
   private List<Chips> chips;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }
    public void addSandwichToOrder(Sandwich sandwich){

    }
    public void addDrinkToOrder(Drink drink){

    }
    public void addChips(Chips chips){

    }
    public void orderCheckOut(){

    }
    @Override
    public double getPrice() {
        return 0;
    }
}
