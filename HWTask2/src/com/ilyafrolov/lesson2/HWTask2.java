package com.ilyafrolov.lesson2;

public class HWTask2 {
    public static void main (String args []) {

    /*
    Task from Excel - Classwork PART 2
    Написать программу, результатом работы которой будет вывод
    результата сравнения двух введенных чисел.
     */

        int i1 = 123;
        int i2 = 246;

        if (i1 > i2) {
            System.out.println("The first number larger than the second one");
        } else {
            System.out.println("The second number larger than the first one");
        }

        if (i1 % 2 == 0) {
            System.out.println("The first number is even number");
        } else {
            System.out.println("The first number is odd number");
        }

        if (i2 % 2 == 0) {
            System.out.println("The second number is even number");
        } else {
            System.out.println("The second number is odd number");
        }

    /*
     Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
    */
        int n = 7654; // given number
        int n1 = 7000 / 1000; // first number
        int n2 = 600 / 100; // second number
        int n3 = 50 / 10; // third number
        int n4 = 4 / 1; // fourth number


        if (n1-n2 == 0) {
            System.out.println("Some numbers are the same");
            } else if (n1-n3 == 0) {
                System.out.println("Some numbers are the same");
            } else if (n1-n4 == 0) {
                System.out.println("Some numbers are the same");
            } else if (n2-n3 == 0) {
                System.out.println("Some numbers are the same");
            } else if (n2-n4 == 0) {
                System.out.println("Some numbers are the same");
            } else if (n3-n4 == 0) {
                System.out.println("Some numbers are the same");
            } else {
    System.out.println("All numbers are different");
        }

    }

}
