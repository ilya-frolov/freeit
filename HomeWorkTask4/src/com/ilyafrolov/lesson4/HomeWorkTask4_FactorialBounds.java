package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_FactorialBounds {
    public static void main(String[] args) {

        /*
        Задание 10
        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
         */

        Random rand = new Random();
        int num = rand.nextInt(5) + 10; //the bound of a random number from 10 to 15
        System.out.println("The given random number in bounds of 10 - 15: " + num + ".");
        long number = num; //type "long" because from the number 13 factorial is larger than "int".

        for (int i = 1; i < num; i++) {
            number = number * i;
        }
        System.out.println("\nThe factorial of " + num + " = " + number + "." + "\n\nThe program is completed successfully.");

    }
}
