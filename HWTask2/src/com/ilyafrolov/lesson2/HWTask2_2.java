package com.ilyafrolov.lesson2;

public class HWTask2_1 {

    public static void main (String args []) {

        /*
     Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
    */
        int n = 7654; // given number
        int n1 = 7000 / 1000; // first number
        int n2 = 600 / 100; // second number
        int n3 = 50 / 10; // third number
        int n4 = 4 / 1; // fourth number


        if (n1-n2 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n1-n3 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n1-n4 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n2-n3 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n2-n4 == 0) {
            System.out.println("Some numbers are the same");
        } else if (n3-n4 == 0) {
            System.out.println("Some numbers are the same");
        } else {
            System.out.println("It is correct that all figures in the number are different");
        }

    }
}
