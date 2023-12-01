package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Chips implements CostInterface {

    private List<Chips> chips = new ArrayList<>();
    private String chipType;

    // Constructor to initialize the chips with a specific chip type
    public Chips(String chipType) {
        this.chipType = chipType;
    }

    // Getter and setter methods for chip type
    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    // Implementation of the CostInterface method to return the price of the chips
    @Override
    // A fixed price for the chips
    public double getPrice() {
        return 1.5;
    }

    // Override of the toString method to provide a string representation of the chips
    @Override
    public String toString() {
        return String.format("\nChipType = " + chipType);
    }

    public List<Chips> getChips() {
        List<Chips> chips = new ArrayList<>();
        chips.add(new Chips("lays"));
        chips.add(new Chips("cheetos"));
        chips.add(new Chips("doritos"));
        return chips;
    }
}
