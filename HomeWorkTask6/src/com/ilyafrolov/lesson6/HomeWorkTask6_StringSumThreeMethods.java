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
        String s2 = " Let's go!";
        long startTime1 = System.nanoTime();
        while (i != 100000){
            s2 = s2 + s1;
            i++;
        }
        long endTime1 = System.nanoTime();
        System.out.println(endTime1 - startTime1);

        i = 0;
        long startTime2 = System.nanoTime();
        StringBuilder strBuilder = new StringBuilder(" Let's go!");
        while (i != 100000) {
            strBuilder.append(s1);
            i++;
        }
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);

        i = 0;
        long startTime3 = System.nanoTime();
        StringBuffer strBuffer = new StringBuffer(" Let's go!");
        while (i != 100000) {
            strBuffer.append(s1);
            i++;
        }
        long endTime3 = System.nanoTime();
        System.out.println(endTime3 - startTime3);
    }
}
