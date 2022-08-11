package com.ilyafrolov.lesson2;

import java.util.Scanner;

public class HomeWorkTask2_IfFiguresDifferent {

    public static void main(String args[]) {

        /*
        Задание 5
        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        различны?
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit number, please: ");
        int number = input.nextInt(); // given number

        while (number < 1000 || number > 9999) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter, please, again a four-digit number again: ");
            number = input2.nextInt();
        }

        int n1 = number / 1000; // first digit
        int n2 = (number - n1 * 1000) / 100; // second digit
        int n3 = (number - n1 * 1000 - n2 * 100) / 10; // third digit
        int n4 = (number - n1 * 1000 - n2 * 100 - n3 * 10); // fourth digit

        if (n1 - n2 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n1 - n3 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n1 - n4 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n2 - n3 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n2 - n4 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n3 - n4 == 0) {
            System.out.println("Some numbers are the same");
        } else {
            System.out.println("\nIt is correct that all figures in the number are different \n ");
        }

        System.out.println("The program is completed successfully");
    }

}
