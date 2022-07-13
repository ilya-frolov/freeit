package com.ilyafrolov.lesson5;

import java.util.Random;

public class HomeWorkTask5_ArraysMirroredArray {
    public static void main(String[] args) {

        /*
        Задание 15
        Создать массив, заполнить его случайными элементами, распечатать,
        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        еще один массив).
         */

        //Step 1: Creation of random array
        Random rand1 = new Random();
        int length = rand1.nextInt(19) + 1;

        int[] arr = new int[length];
        System.out.print("The array consisting of " + length + " integers: ");
        for (int i = 0; i < arr.length; i++) {
            Random rand2 = new Random();
            int num = rand2.nextInt(20);

            arr[i] = num;
            System.out.print("" + arr[i] + " ");
        }

        //Step 2: Creation of mirrored array
        System.out.print("\n\nThe mirrored array: ");
        for (int i = 0; i < arr.length / 2; i++) {
            int tempor = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = tempor;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + " ");
        }
        System.out.println("\n\nThe program is completed successfully.");
    }
}
