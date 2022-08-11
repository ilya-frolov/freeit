package com.ilyafrolov.lesson3;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class HomeWorkTask3_GreetingGenderAge {
    public static void main(String args[]) {

        /*
        Написать программу, которая приветствует пользователя в зависимости
        от его пола и возраста (имя, пол и возраст задаются при старте программы)
         */

        //Step 1: creation of male and female name Arrays

        String[] maleNames = {"Ilya", "Artem", "Roman", "Raman", "Dzmitry", "Aleksandr", "Vladimir", "Maksim", "Ivan"};
        String[] femaleNames = {"Iryna", "Marina", "Anastasia", "Aleksandra", "Anna", "Oksana"};
        String[] allNames = {"Ilya", "Artem", "Roman", "Raman", "Dzmitry", "Aleksandr", "Vladimir", "Maksim", "Ivan", "Iryna", "Marina", "Anastasia", "Aleksandra", "Anna", "Oksana"};

        //Step 2: name and age input. The name input is created in relation to our group students' names.

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your name, please, from this list:");

        //assignment of dot in the end of names list
        for (int i = 0; i < maleNames.length; i++) {
            System.out.print(maleNames[i]);
            if (i == maleNames.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("");

        //assignment of dot in the end of the name list
        for (int i = 0; i < femaleNames.length; i++) {
            System.out.print(femaleNames[i]);
             if (i == femaleNames.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("\n\nEnter the chosen name, please: ");
        String name = sc.nextLine();

        // Step 3: verification if the entered name is from the list
        for (int i = 0; i < allNames.length; i++) {
            if (!Arrays.asList(allNames).contains(name)) {
                System.out.println("Choose the name from the provided name list, please: ");
            } else {
                break;
            }
            name = sc.nextLine();
        }

        //Step 4: age input
        System.out.println("\nEnter your age, please: ");
        int age = sc.nextInt();


        //Step 5: verification the allowed age and greeting according to a gender

        if (age < 18) {
            System.out.println("You are too young for this shit, sorry :(");
        } else {
            for (int i = 0; i < maleNames.length; i++) {
                if (name.equals(maleNames[i])) {
                    System.out.println("Hey you, old fella!");
                    break;
                }
                if (name.equals(femaleNames[i])) {
                    System.out.println("You are welcome, awesome ;)");
                    break;
                }
            }

        }
        System.out.println("\nThe program is completed successfully.");
    }
}

