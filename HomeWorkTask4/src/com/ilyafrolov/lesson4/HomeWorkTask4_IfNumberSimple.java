package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_IfNumberSimple {
    public static void main(String[] args) {

        /*
        Задание 11
        Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
         */

        //assigning the number which would be checked if it is simple
        Random rand = new Random();
        int num = rand.nextInt(1000);
        System.out.println("The random given number is: " + num + ".");

        if (num == 2) {
            System.out.println("\nThe given number is simple.");
        }

        boolean isSimple = true;

        int i = 2;

        while (i != num - 1) {
            if (num % i == 0) {
                isSimple = false;
                break;
            } else {
                i++;
            }
        }

        if (isSimple) {
            System.out.println("\nThe given number is simple.");
        } else {
            System.out.println("\nThe given number is NOT simple.");
        }

        System.out.println("\nThe program is completed successfully.");
    }
}
