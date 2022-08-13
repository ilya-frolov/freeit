package com.ilyafrolov.lesson9;

public class Dishwasher extends WashingAppliances {

    int capacity;

    protected Dishwasher(String brand, int power, boolean waterSupply, int capacity) {
        super(brand, power, waterSupply);
        this.capacity = capacity;
    }

    public String toString() {
        return "Dishwasher {" + super.toString() + ", the capacity is " + capacity + " liters.}";
    }

    public String isPluggedIn() {
        return "The dishwasher" + super.isPluggedIn();
    }
}
