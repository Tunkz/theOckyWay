package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements CostInterface {
    private int size;
    private String breadType;
    private List<Topping> toppings;
    private boolean toasted;
    private boolean extraCheese;
    private boolean extraMeat;


    public Sandwich(int size, String breadType, boolean toasted, boolean extraCheese, boolean extraMeat) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
        this.toasted = toasted;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
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
        double price = 0;

        if (this.size == 4){
            price+=5.50;
            if(extraMeat)price+=.5;
            if(extraCheese)price+=.3;
        }else if (this.size ==8){
            price+= 7;
            if(extraMeat)price+=1;
            if(extraCheese)price+=.6;
        } else  {
            price +=8.50;
            if(extraMeat)price+=1.5;
            if(extraCheese)price+=.9;
        }

        for (Topping x:toppings){
            if(x instanceof PremiumTopping){
                ((PremiumTopping) x).getPrice(this.size+"");
            }
        }

        return price;
    }

    public double breadSizeInInches() {
        return 0;
    }
    public void addTopping(PremiumTopping premiumTopping){
        this.toppings.add(premiumTopping);
    }

    @Override
    public String toString() {
//        String toastedTemp = "yes";
//        if (toasted == false){
//            toastedTemp = "No";
//        }
        String AllToppings = "";
        for (Topping x:toppings){
            AllToppings+= x.getName()+" ";
        }
        if(toppings.isEmpty())AllToppings += "no topping";
        return "\nSandwich " +
                "\nsize = " + size +
                ", \nbreadType = " + breadType +
                ", \ntoppings = " + AllToppings +
                ", \ntoasted = " + (toasted?"Yes":"No") +
                ", \nextraCheese = " + (extraCheese?"Yes":"No") +
                ",\nextraMeat = " + (extraMeat?"Yes":"No");
    }
}
