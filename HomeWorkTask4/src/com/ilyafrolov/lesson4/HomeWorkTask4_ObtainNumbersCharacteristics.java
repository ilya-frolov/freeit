package com.ilyafrolov.lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class HomeWorkTask4_ObtainNumbersCharacteristics {
    public static void main(String[] args) {

        /*
        Задание 6
        1. Создайте число.
        2. Определите, является ли число трехзначным.
        3. Определите, является ли его последняя цифра семеркой.
        4. Определите, является ли число четным.
         */

        //Step 1: input a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number, please: ");
        int n = input.nextInt();

        //Step 2: verification if the number is three-digit one
        if (n < 1000 && n > 99 || n < -99 && n > -1000) {
            System.out.println("\nThe given number is a three-digit one.");

        } else {
            System.out.println("\nThe given number is NOT a three-digit one, sorry :(");
        }

        //Step 3: verification if the last digit of the given number is 7
        String number = String.valueOf(n);
        char[] digit = number.toCharArray();

        for (int i = digit.length - 1; i < digit.length; i++)
            if (digit[i] == '7') {
                System.out.println("\nThe last digit of the given number is 7.");
            } else {
                System.out.println("\nThe last digit of the given number is NOT 7.");
            }

        //Step 4: verification if the given number is even
        {
            if (n % 2 == 0) {
                System.out.println("\nThe given number is even.");
            } else {
                System.out.println("\nThe given number is odd.");
            }
        }

    }
}
