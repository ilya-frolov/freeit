package com.ilyafrolov.lesson2;

public class HomeWorkTask2_Comparison {
    public static void main(String args[]) {

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
            System.out.println("The second number larger than the first one or equal to it");
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

    }

}
