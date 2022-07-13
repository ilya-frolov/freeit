package com.ilyafrolov.lesson5;

import java.util.Random;

public class HomeWorkTask5_ArraysFindMaxValue {
    public static void main(String[] args) {

        /*
        Задание 13
        Создать последовательность случайных чисел, найти и вывести наибольшее из них.
        */

        Random rand = new Random();

        //Step 1: Creating array of 7 random integers.
        int[] arr = new int[7];

        System.out.print("Integers array: ");
        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(100);

            arr[i] = num;
            System.out.print("" + arr[i] + " ");
        }

        //Step 2: Verification of the maximal integer in the array.
        int max = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }

        System.out.print("\nThe maximal integer is: " + arr[max]);
        System.out.println("\n\nThe program is completed successfully.");
    }

}
