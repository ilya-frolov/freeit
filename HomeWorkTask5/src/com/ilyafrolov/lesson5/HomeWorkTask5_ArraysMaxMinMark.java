package com.ilyafrolov.lesson5;

import java.util.Random;

public class HomeWorkTask5_ArraysMaxMinMark {
    public static void main(String[] args) {

        /*
        Задание 14
        Создать массив оценок произвольной длины, вывести максимальную и
        минимальную оценку, её (их) номера.
        */

        //Step 1: Creation of marks array of random length
        Random rand1 = new Random();
        int length = rand1.nextInt(19) + 1;

        int[] marksArr = new int[length];
        System.out.print("Array of marks consisting of " + length + " integers: ");
        for (int i = 0; i < marksArr.length; i++) {
            Random rand2 = new Random();
            int mark = rand2.nextInt(9) + 1;

            marksArr[i] = mark;
            System.out.print("" + marksArr[i] + " ");
        }

        //Step 2: Verification of the maximum and minimum marks in the array
        int max = 0;
        int min = 0;

        for (int i = 1; i < marksArr.length; i++) {
            if (marksArr[i] > marksArr[max]) {
                max = i;
            }
            if (marksArr[i] < marksArr[min]) {
                min = i;
            }
        }

        //Step 3: Verification of the indexes of maximum and minimum marks in the array
        String max2 = "";
        String min2 = "";

        for (int i = 0; i < marksArr.length; i++) {
            if (marksArr[i] == marksArr[max]) {
                max2 = max2 + (i + 1) + " ";
            }
            if (marksArr[i] == marksArr[min]) {
                min2 = min2 + (i + 1) + " ";
            }
        }

        System.out.println("\n\nThe maximum mark is: " + marksArr[max] + " and its index(es) is (are): " + max2);
        System.out.println("The minimum mark is: " + marksArr[min] + " and its index(es) is (are): " + min2);
        System.out.println("\nThe program is completed successfully.");
    }
}
