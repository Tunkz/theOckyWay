package com.pluralsight.deli;

public class Chips implements CostInterface {

   private Chips chipType;

    public Chips(Chips chipType) {
        this.chipType = chipType;
    }

    public Chips getChipType() {
        return chipType;
    }

    public void setChipType(Chips chipType) {
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
