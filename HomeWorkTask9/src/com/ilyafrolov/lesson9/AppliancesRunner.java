package com.ilyafrolov.lesson9;

public class AppliancesRunner {
    public static void main(String args[]) {


        /*
        Задание 26
        Создать иерархию классов, описывающих бытовую технику. Создать несколько
        объектов описанных классов, часть из них включить в розетку.
        Иерархия должна иметь хотя бы три уровня.
         */

        Dishwasher dw = new Dishwasher("Bosch", 1500, true, 40);
        System.out.println(dw);

        WashingMachine wm = new WashingMachine("LG", 2500, true, 7);
        System.out.println(wm);

        System.out.println(dw.isPluggedIn());
        System.out.println(wm.isPluggedIn());

        Microwave mw = new Microwave("Electra", 1000, "white", "grill");
        System.out.println(mw);

        Oven ov = new Oven("Delongi", 3500, "silver", 200);
        System.out.println(ov);

        System.out.println(mw.isPluggedIn());
        System.out.println(ov.isPluggedIn());
    }
}
