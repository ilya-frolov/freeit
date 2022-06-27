package com.ilyafrolov.lesson3;

public class HomeWorkTask3_FiveWaysString {
    public static void main(String args[]) {

        //Method 1:
        String alyo1 = new String ("nu che ty, Oleg?");
        System.out.println("Method 1:");
        System.out.println(alyo1);

        //Method 2:
        String alyo2 = "nu che ty, Oleg?";
        System.out.println("\nMethod 2:");
        System.out.println(alyo2);

        //Method 3:
        String s1 = "nu che ";
        String s2 = "ty, Oleg?";
        System.out.println("\nMethod 3:");
        System.out.println(s1 + s2);

        //Method 3_2:
        String alyo3 = s1 + s2;
        System.out.println("\nMethod 3_2:");
        System.out.println(alyo3);

        //Method 4:
        String alyo4 = "nu che " + "ty, Oleg?";
        System.out.println("\nMethod 4:");
        System.out.println(alyo4);

        //Method 5:
        //letters for the word 'nu'
        byte b1 = 110;
        byte b2 = 117;
        char letter1 = (char)b1;
        char letter2 = (char)b2;
        //letters for the word 'che'
        byte b3 = 99;
        byte b4 = 104;
        byte b5 = 101;
        char letter3 = (char)b3;
        char letter4 = (char)b4;
        char letter5 = (char)b5;
        //letters for the word 'ty'
        byte b6 = 116;
        byte b7 = 121;
        char letter6 = (char)b6;
        char letter7 = (char)b7;
        //letters for the word 'Oleg'
        byte b8 = 79;
        byte b9 = 108;
        byte b10 = 103;
        char letter8 = (char)b8;
        char letter9 = (char)b9;
        char letter10 = (char)b10;

        System.out.println("\nMethod 5:");
        System.out.println(letter1 + "" + letter2 + " " + letter3 + "" + letter4 + "" + letter5 + " "
        + letter6 + "" + letter7 + ", " + letter8 + "" + letter9 + "" + letter5 + "" + letter10 + "?");

        //Method 5_2:
        //letters for the word 'nu'
        char b11 = 110;
        char b12 = 117;
        //letters for the word 'che'
        char b13 = 99;
        char b14 = 104;
        char b15 = 101;
        //letters for the word 'ty'
        char b16 = 116;
        char b17 = 121;
        //letters for the word 'Oleg'
        char b18 = 79;
        char b19 = 108;
        char b20 = 103;

        System.out.println("\nMethod 5_2:");
        System.out.println(b11 + "" + b12 + " " + b13 + "" + b14 + "" + b15 + " "
                + b16 + "" + b17 + ", " + b18 + "" + b19 + "" + b15 + "" + b20 + "?");
    }
}
