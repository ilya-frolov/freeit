package com.ilyafrolov.lesson5;

import java.util.Random;

public class HomeWorkTask5_ArraysButterfly {
    public static void main(String[] args) {

        /*
        Задание 17
        Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е. таким образом:
        1 1 1 1 1
        0 1 1 1 0
        0 0 1 0 0
        0 1 1 1 0
        1 1 1 1 1
         */

        //Step 1: Creation of the array upper part
        int[][] butfly = new int[5][5];
        int n = 0;
        for (int i = 0; i < butfly.length - 2; i++) {
            for (int i1 = n; i1 < butfly[i].length - n; i1++) {
                butfly[i][i1] = 1;
            }
            n += 1;
        }

        //Step 2: Creation of the array bottom part
        n = 1;
        for (int i = butfly.length - 2; i < butfly.length; i++) {
            for (int i1 = n; i1 < butfly[i].length - n; i1++) {
                butfly[i][i1] = 1;
            }
            n -= 1;
        }

        //Step 3: Printing the array filled in the form of butterfly
        for (int i = 0; i < butfly.length; i++) {
            for (int i1 = 0; i1 < butfly[i].length; i1++) {
                System.out.print("" + butfly[i][i1] + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("\nThe program is completed successfully.");
    }
}

