package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_PadejRubles {
    public static void main(String[] args) {

        /*
        Задание 8.
        Имеется целое число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt()).
        Это число – количество денег в рублях. Вывести это число,
        добавив к нему слово «рублей» в правильном падеже.
         */

        //Step 1: obtaining the natural given number
        Random rand = new Random();
        int x = rand.nextInt(2000);

        //Step 2: supplying positive numbers
        if (x < 0) {
            x = x * (-1);
        }

        //Step 3: printing the rubles value with the word "rubley" in correct padej
        String rubl = "rubl";

        String number = String.valueOf(x);
        char[] digit = number.toCharArray();

        if (x > 10) {
            for (int i = digit.length - 2; i < digit.length - 1; i++) {
                if (digit[digit.length - 2] == '1') {
                    System.out.println("" + x + " " + rubl + "ej");
                } else {
                    for (int j = digit.length - 1; j < digit.length; j++) {
                        switch (digit[j]) {
                            case '1' -> System.out.println("" + x + " " + rubl + "'");
                            case '2', '3', '4' -> System.out.println("" + x + " " + rubl + "ya");
                            default -> System.out.println("" + x + " " + rubl + "ej");
                        }
                    }
                }
            }
        } else {
            for (int i = digit.length - 1; i < digit.length; i++) {
                switch (digit[i]) {
                    case '1' -> System.out.println("" + x + " " + rubl + "'");
                    case '2', '3', '4' -> System.out.println("" + x + " " + rubl + "ya");
                    default -> System.out.println("" + x + " " + rubl + "ej");
                }
            }
        }
    }
}
