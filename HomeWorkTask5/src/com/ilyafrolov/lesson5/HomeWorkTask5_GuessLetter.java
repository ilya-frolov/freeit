package com.ilyafrolov.lesson5;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTask5_GuessLetter {
    public static void main(String[] rags) {

       /*
        Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
        При каждом вводе пользователем программа долна говорить "warmly, hot" или
       "chilly, cold" в зависимости от того, как далеко буква пользователя от загаданной
     */

        //Step 1: Creation of a random letter
        Random rand = new Random();
        int num = rand.nextInt(26) + 97;
        char letter = (char) num;
        System.out.println("" + letter);

        //Step 2: First guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter, please, the lowercase letter you guess: ");
        char in1 = input.next().charAt(0);
        int n1 = (int) in1;

        //Step 3: Other guesses
        if (in1 != letter) {
            System.out.println("You are not correct.\nEnter, please, again " +
                    "the lowercase letter you guess: ");
            boolean guess = true;
            while (guess) {
                Scanner input2 = new Scanner(System.in);
                char in2 = input2.next().charAt(0);
                int n2 = (int) in2;

                int section1 = num - 97;
                int section2 = 122 - num;
                if (in2 != letter) {
                    if (n2 < (97 + section1 / 4) || n2 > (122 - section2 / 4)) {
                        System.out.println("Cold! Try again.");
                    } else if (n2 < (97 + section1 / 2) && n2 >= (97 + section1 / 4) || n2 > (122 - section2 / 2) && n2 <= (122 - section2 / 4)) {
                        System.out.println("Chilly! Try again.");
                    } else if (n2 < (97 + (section1 / 4) * 3) && n2 >= (97 + section1 / 2) || n2 > (122 - (section2 / 4) * 3) && n2 <= (122 - section2 / 2)) {
                        System.out.println("Warmly! Try again.");
                    } else if (n2 < num && n2 >= (97 + (section1 / 4) * 3) || n2 > num && n2 <= (122 - (section2 / 4) * 3)) {
                        System.out.println("Hot! Try again.");
                    }
                } else {
                    guess = false;
                    System.out.println("You are right! The letter is: " + letter + ".");
                }

            }
        } else {
            System.out.println("You are right! The letter is: " + letter + ".");
        }
        System.out.println("\nThe program is completed successfully.");
    }

}
