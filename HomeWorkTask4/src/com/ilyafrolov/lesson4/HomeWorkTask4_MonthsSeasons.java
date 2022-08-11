package com.ilyafrolov.lesson4;

import java.util.Random;

public class HomeWorkTask4_MonthsSeasons {
    public static void main(String args[]) {

        /*
        Написать программу, в которой в консоль будет выводится название месяца и сезон,
        к которму этот месяц относится (написать с помощью  if  и с помощью switch)
         */


        //call random index of month
        Random rand = new Random ();
        int n = rand.nextInt(11) + 1; // +1 due to the fact that bound is counted from 0(inclusive)
        System.out.println("Given random month index: " + n + "\n");

        // assignment of months and seasons according to index

        //Method 1 - using 'if'
        System.out.println("Result from method 1: using 'if':");
        if (n == 1) {
            System.out.println("January (winter)");
        } else if (n == 2) {
            System.out.println("February (winter)");
        } else if (n == 3) {
            System.out.println("March (spring)");
        } else if (n == 4) {
            System.out.println("April (spring)");
        } else if (n == 5) {
            System.out.println("May (spring)");
        } else if (n == 6) {
            System.out.println("June (summer)");
        } else if (n == 7) {
            System.out.println("July (summer)");
        } else if (n == 8) {
            System.out.println("August (summer)");
        } else if (n == 9) {
            System.out.println("September (autumn)");
        } else if (n == 10) {
            System.out.println("October (autumn)");
        } else if (n == 11) {
            System.out.println("November (autumn)");
        } else if (n == 12) {
            System.out.println("December (winter)");
        }

        System.out.println("\nResult from method 2: using 'switch':");
        //Method 2 - using 'switch'
        switch (n) {
            case 1:
            System.out.println("January (winter)");
            break;
            case 2:
            System.out.println("February (winter)");
            break;
            case 3:
            System.out.println("March (spring)");
            break;
            case 4:
            System.out.println("April (spring)");
            break;
            case 5:
            System.out.println("May (spring)");
            break;
            case 6:
            System.out.println("June (summer)");
            break;
            case 7:
            System.out.println("July (summer)");
            break;
            case 8:
            System.out.println("August (summer)");
            break;
            case 9:
            System.out.println("September (autumn)");
            break;
            case 10:
            System.out.println("October (autumn)");
            break;
            case 11:
            System.out.println("November (autumn)");
            break;
            case 12:
            System.out.println("December (winter)");
            break;

        }

        System.out.println("\nThe program is completed successfully.");
    }
}
