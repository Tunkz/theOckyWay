package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class RegularToppings extends Topping{
    private List<RegularToppings> regularToppings = new ArrayList<>();
    public RegularToppings(String name) {
        super(name);
    }



    public void setRegularToppings(List<RegularToppings> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<RegularToppings> getRegularToppings(){
        List<RegularToppings> regularTopping= new ArrayList<>();
        regularTopping.add(new RegularToppings("lettuce"));
        regularTopping.add(new RegularToppings("peppers"));
        regularTopping.add(new RegularToppings("onion"));
        regularTopping.add(new RegularToppings("tomatoes"));
        regularTopping.add(new RegularToppings("jalapenos"));
        regularTopping.add(new RegularToppings("cucumbers"));
        regularTopping.add(new RegularToppings("pickles"));
        regularTopping.add(new RegularToppings("guacamole"));
        regularTopping.add(new RegularToppings("mushrooms"));

        return regularTopping;
    }

    @Override
    public String toString() {
        return " RegularToppings = ";
    }
}
