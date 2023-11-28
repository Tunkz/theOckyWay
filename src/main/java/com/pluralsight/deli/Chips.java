package com.pluralsight.deli;

public class Chips implements CostInterface {

   private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
