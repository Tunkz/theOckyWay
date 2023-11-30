package com.pluralsight.deli;

public class Chips implements CostInterface {

    // Type of chips
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
        return "Chips{" +
                "chipType='" + chipType + '\'' +
                '}';
    }
}
