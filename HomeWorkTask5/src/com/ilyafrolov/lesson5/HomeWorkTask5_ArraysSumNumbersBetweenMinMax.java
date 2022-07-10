package com.ilyafrolov.lesson5;

import java.util.Random;

public class HomeWorkTask5_ArraysSumNumbersBetweenMinMax {
    public static void main(String[] args) {

        /*
        Задание 16
        Определите сумму элементов одномерного массива, расположенных между
        минимальным и максимальным значениями.
         */

        //Step 1: Creation of random 1D array
        Random rand1 = new Random();
        int length = rand1.nextInt(19) + 1;

        int[] arr = new int[length];

        System.out.print("The array of random numbers consisting of " + length + " integers: ");
        for (int i = 0; i < arr.length; i++) {
            Random rand2 = new Random();
            int num = rand2.nextInt(20);

            arr[i] = num;
            System.out.print("" + arr[i] + " ");
        }

        //Step 2: Verification of maximum and minimum integers of array
        int max = 0;
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        //Step 3: Calculation of the sum of the numbers between first min and max integers
        int sum = 0;
        if (max > min) {
            for (int i = 1; i < arr.length; i++) {
                if (i > min && i < max) {
                    sum = sum + arr[i];
                }
            }
        }
        if (max < min) {
            for (int i = 1; i < arr.length; i++) {
                if (i < min && i > max) {
                    sum = sum + arr[i];
                }
            }
        }
        System.out.println("\n\nThe sum of numbers between the first maximum integer " + arr[max] + " and the first minimum integer " + arr[min] + " is: " + sum);
        System.out.println("\nThe program is completed successfully.");
    }
}
