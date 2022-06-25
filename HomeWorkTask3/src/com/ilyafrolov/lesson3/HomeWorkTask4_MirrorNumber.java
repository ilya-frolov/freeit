package com.ilyafrolov.lesson3;

import java.util.Scanner;
import java.util.Random;

public class HomeWorkTask4_MirrorNumber {
    public static void main(String args[]) {

        /*
        Задание 4
        Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n.
         */

        /*
        Two solutions are provided for this task: without using arrays and by using arrays.
         */

        /*
        First solution - without using arrays.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit natural number, please:");
        int n = input.nextInt(); //given number


        //verification if the number is a natural and a four-digit one
        while (n < 1000 || n > 9999) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter a four-digit positive number, please:");
            n = input2.nextInt();
        }

        int n1 = n / 1000;// the first digit of the given number
        int n2 = (n - n1 * 1000) / 100;// the second digit of the given number
        int n3 = (n - n1 * 1000 - n2 * 100) / 10;// the third digit of the given number
        int n4 = n - n1 * 1000 - n2 * 100 - n3 * 10;// the fourth digit of the given number

        System.out.println("A mirrored number according to the first solution approach:");
        System.out.println(n4 + "" + n3 + "" + n2 + "" + n1);// the mirrored number


        /*
        Second solution - by using arrays (not required here, just for practicing).
         */

        Random rand = new Random();
        int[] number = new int[4];// creation of new int array with four cells
        System.out.print("\nRandom given four-digit number:");

        // assignment for all cells in the array and obtaining given number:
        for (int i = 0; i < number.length; i++) {
            number[i] = rand.nextInt(9) + 1;
            System.out.print(number[i]);
        }

        String s = String.valueOf(number);

        int[] number2 = new int[4];// creation of second new int array with four cells
        System.out.print("\nA mirrored number according to the second solution approach:");

        number2[0] = number[3];
        number2[1] = number[2];
        number2[2] = number[1];
        number2[3] = number[0];

        for (int j = 0; j < number.length; j++) {
            System.out.print(number2[j]);
        }

        System.out.println("\n\nThe program is completed successfully.");
    }

}
