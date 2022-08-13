package com.ilyafrolov.lesson9;

public class CookingAppliances extends Appliances {

    String color;

    protected CookingAppliances(String brand, int power, String color) {
        super(brand, power);
        this.color = color;
    }

    public String toString() {
        return super.toString() + ", color is " + color;
    }

    public String isPluggedIn() {
        return " is plugged in.";
    }

}
