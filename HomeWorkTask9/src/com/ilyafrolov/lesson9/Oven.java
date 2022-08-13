package com.ilyafrolov.lesson9;

public class Oven extends CookingAppliances{

    int temperature;
    public Oven(String brand, int power, String color, int temperature) {
        super(brand, power, color);
        this.temperature = temperature;
    }

    public String toString() {
        return "Oven {" + super.toString() + "}";
    }

    public String isPluggedIn() {
        return "The oven" + super.isPluggedIn()+ " The set temperature is " + temperature + " degrees.";
    }
}
