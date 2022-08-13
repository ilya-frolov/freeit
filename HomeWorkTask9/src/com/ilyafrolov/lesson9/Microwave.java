package com.ilyafrolov.lesson9;

public class Microwave extends CookingAppliances {

    String mode;

    protected Microwave(String brand, int power, String color, String mode){
        super(brand, power, color);
        this.mode = mode;
    }

    public String toString() {
        return "Microwave {" + super.toString() + "}";
    }

    public String isPluggedIn() {
        return "The microwave" + super.isPluggedIn() + " The mode is " + mode + ".";
    }
}
