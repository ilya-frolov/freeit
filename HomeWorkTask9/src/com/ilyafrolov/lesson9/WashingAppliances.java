package com.ilyafrolov.lesson9;

public class WashingAppliances extends Appliances {

    protected boolean waterSupply;

    protected WashingAppliances(String brand, int power, boolean waterSupply) {
        super(brand, power);
        this.waterSupply = waterSupply;

    }

//    protected String ifWaterSupplyExist() {
//        if (waterSupply) {
//            return "exist";
//        } else {
//            return "doesn't exist";
//        }
//    }

    public String toString() {
        return super.toString() + ", water consumption is " + waterSupply;
    }

    public String isPluggedIn() {
        return " is plugged in.";
    }
}
