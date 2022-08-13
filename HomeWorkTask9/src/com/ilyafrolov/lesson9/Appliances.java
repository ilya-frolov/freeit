package com.ilyafrolov.lesson9;

public class Appliances {

    protected String brand;
    protected int power;

    protected Appliances(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String isPluggedIn() {
        return " is plugged in.";
    }

    public String toString() {
        return "The brand is " + brand + ", the power is " + power + " watt";
    }
}
