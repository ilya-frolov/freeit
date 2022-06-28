package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_IfNumberSimple {
    public static void main(String[] args) {

        /*
        Задание 11
        Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.
         */

        Random rand = new Random();
        int num = rand.nextInt(200);
        System.out.println("The random given number is: " + num + ".");

        if (num != 2 && num !=3 && num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0 || num % 13 == 0){
            System.out.println("\nThe given number is NOT simple.");
        } else {
            System.out.println("\nThe given number is simple.");
        }
    System.out.println("\nThe program is completed successfully.");
    }
}
