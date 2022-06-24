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
        int periodInSec = input.nextInt(); //given time period in seconds

        while (periodInSec < 0) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter the positive value for time period in seconds, please: ");
            periodInSec = input2.nextInt(); //given time period in seconds
        }

        int periodInMin = periodInSec / 60;                      //given time period in minutes without the rest of time in seconds
        int periodRestSec = periodInSec - periodInMin * 60;      //the rest of time in seconds to full minutes number included into given time period

        int periodInHours = periodInMin / 60;                    //given time period in hours
        int periodRestMin = periodInMin - periodInHours * 60;    //the rest of time in minutes to full hours number included into given time period

        int periodInDays = periodInHours / 24;                   //given time period in days
        int periodRestHours = periodInHours - periodInDays * 24; //the rest of time in hours to full days number included into given time period

        int periodInWeeks = periodInDays / 7;                    //given time period in weeks
        int periodRestDays = periodInDays - periodInWeeks * 7;   //the rest of time in days to full weeks number included into given time period

        System.out.println("A) " + periodInMin + " min " + periodRestSec + " s"); // gine time period in minutes and seconds
        System.out.println("B) " + periodInHours + " hours " + periodRestMin + " min " + periodRestSec + " s"); // gine time period in hours, minutes and seconds
        System.out.println("C) " + periodInDays + " days " + periodRestHours + " hours " + periodRestMin + " min " + periodRestSec + " s"); // gine time period in days, hours, minutes and seconds
        System.out.println("D) " + periodInWeeks + " weeks " + periodRestDays + " days " + periodRestHours + " hours " + periodRestMin + " min " + periodRestSec + " s"); // gine time period in weeks, days, hours, minutes and seconds

        System.out.println("\nThe program is completed successfully!");
    }
}
