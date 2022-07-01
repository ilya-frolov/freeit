package com.ilyafrolov.lesson3;

import java.util.Scanner;

public class HomeWorkTask3_TimeTask {
    public static void main(String args[]) {

        /*
        Задание 3
        Имеется 4500 секунд. Вывести в консоль содержащиеся в этом количестве секунд:
            А) минут + секунд,
            В) часов + минут + секунд,
            С) дней + часов + минут + секунд,
            D) недель + дней + часов + минут + секунд.
        по аналогии с примером выше.
         */

        /*
        I make the program with request to enter the time period in seconds.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time period in seconds, please: ");
        int periodInSec = input.nextInt();

        while (periodInSec < 0) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter the positive value for time period in seconds, please: ");
            periodInSec = input2.nextInt();
        }

        int periodInMin = periodInSec / 60;
        int periodRestSec = periodInSec - periodInMin * 60;

        int periodInHours = periodInMin / 60;
        int periodRestMin = periodInMin - periodInHours * 60;

        int periodInDays = periodInHours / 24;
        int periodRestHours = periodInHours - periodInDays * 24;

        int periodInWeeks = periodInDays / 7;
        int periodRestDays = periodInDays - periodInWeeks * 7;

        System.out.println("A) " + periodInMin + " min " + periodRestSec + " s"); // gine time period in minutes and seconds
        System.out.println("B) " + periodInHours + " hours " + periodRestMin + " min " + periodRestSec + " s");
        System.out.println("C) " + periodInDays + " days " + periodRestHours + " hours " + periodRestMin + " min " + periodRestSec + " s");
        System.out.println("D) " + periodInWeeks + " weeks " + periodRestDays + " days " + periodRestHours + " hours " + periodRestMin + " min " + periodRestSec + " s");

        System.out.println("\nThe program is completed successfully!");
    }
}
