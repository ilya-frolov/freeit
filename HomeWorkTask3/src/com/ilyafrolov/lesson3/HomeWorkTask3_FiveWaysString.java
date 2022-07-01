package com.ilyafrolov.lesson3;

public class HomeWorkTask3_FiveWaysString {
    public static void main(String args[]) {

        //Method 1: new object is only created in Heap
        String alyo1 = new String("nu che ty, Oleg?");
        System.out.println("Method 1: " + "\n" + alyo1);

        //Method 2: new object is created in Heap and also the string value auto-interned into Int Pool
        String alyo2 = "nu che ty, Oleg?";
        System.out.println("\nMethod 2: " + "\n" + alyo2);

        //Method 3: new object is not created and the string value is obtained straight from Int Pool
        String alyo3 = "nu che ty, Oleg?";
        System.out.println("\nMethod 3: " + "\n" + alyo3);

        //Method 4: new object is not created and the string value is obtained straight from Int Pool
        String alyo4 = alyo2;
        System.out.println("\nMethod 4: " + "\n" + alyo4);

        //Method 5: two new objects are created and added into Int Pool, after that there values are summed
        String s1 = "nu che ";
        String s2 = "ty, Oleg?";
        String alyo5 = s1 + s2;
        System.out.println("\nMethod 5: " + "\n" + alyo5);

        //Method 6: using array
        char[] data = {'n', 'u', ' ', 'c', 'h', 'e', ' ', 't', 'y', ',', ' ', 'O', 'l', 'e', 'g', '?'};
        String alyo6 = new String(data);
        System.out.println("\nMethod 6: " + "\n" + alyo6);

    }
}
