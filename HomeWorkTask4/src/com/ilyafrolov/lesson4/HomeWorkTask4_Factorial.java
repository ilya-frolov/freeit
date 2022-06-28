package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_Factorial {
    public static void main(String[] args) {

        /*
        Задание 9
        Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
        а произведение, т.е. факториал числа.
         */

        Random rand = new Random();
        int x = rand.nextInt(19) + 1;

        System.out.println("The random given number: " + x);

        int n = 1;
        long factorial = x;

        while ((x - n) != 1) {
            factorial *= (x - n);
            n++;
        }

        System.out.println("\nFactorial of " + x + " = " + factorial + ".");
cd d:\
    }
}
