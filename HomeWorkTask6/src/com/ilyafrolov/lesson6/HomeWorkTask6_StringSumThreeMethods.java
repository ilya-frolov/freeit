package com.ilyafrolov.lesson6;

public class HomeWorkTask6_StringSumThreeMethods {
    public static void main(String[] args) {

        /*
        Задание 21
        Напишите три цикла выполняющих многократное сложение строк, один с
        помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
         */

        int i = 0;
        String s1 = "Hey ho!";

        long startTime1 = System.nanoTime();
        while (i != 1000000000){
            String s2 = " Let's go!";
            String s3 = s1 + s2;
            i++;
        }
        long endTime1 = System.nanoTime();
        System.out.println(endTime1 - startTime1);

        i = 0;
        long startTime2 = System.nanoTime();
        while (i != 1000000000) {
            StringBuilder strBuilder = new StringBuilder(" Let's go!");
            strBuilder.append(s1);
            i++;
        }
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);

        i = 0;
        long startTime3 = System.nanoTime();
        while (i != 1000000000) {
            StringBuffer strBuffer = new StringBuffer(" Let's go!");
            strBuffer.append(s1);
            i++;
        }
        long endTime3 = System.nanoTime();
        System.out.println(endTime3 - startTime3);
    }
}
