package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_SumNumbersDividedThree {
    public static void main(String[] args) {

        /*
        Задание 12
        Найдите сумму первых n целых чисел, которые делятся на 3.
         */

        Random rand = new Random();
        int i = rand.nextInt(100);// first value for starting searching from it numbers divided by three
        System.out.println("The first value to start from it searching for numbers divided by three: " + i + ".");
        int j = i;

        Random rand2 = new Random();
        int n = rand2.nextInt(10) + 1;// number of integers for summing
        System.out.println("\nThe number of integers for summing: " + n + ".");

        int sum = 0;// the variable which includes sum of all integers divided by three in the defined bounds
        int k = 0;// the variable for counting the number of integers divided by three and for comparing with the given bound 'n'

        while (k != n) {
            if (j % 3 == 0) {
                sum += j;
                j += 3;
                k++;
            } else {
                j++;
            }
        }
        System.out.println("\nThe sum of " + n + " integers, divided by three, " +
                "when counting start from the number " + i + ": " + sum + ".");
    }
}
