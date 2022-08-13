package com.ilyafrolov.lesson9;

public class WashingMachine extends WashingAppliances {

    int capacity;

    protected WashingMachine(String brand, int power, boolean waterSupply, int capacity) {
        super(brand, power, waterSupply);
        this.capacity = capacity;
    }

    public String toString() {
        return "Washing machine {" + super.toString() + ", the capacity is " + capacity + " kilogram.}";
    }

    public String isPluggedIn() {
        return "The washing machine" + super.isPluggedIn();
    }

}
