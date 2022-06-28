package com.ilyafrolov.lesson4.com.ilyafrolov.lesson4;

import java.util.Random;
import java.lang.Math;

public class HomeWorkTask4_CloseRectHoleRoundCover {
    public static void main(String[] args) {

        /*
        Имеется прямоугольное отверстие размерами a и b.
        Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
         */

        /*
        Logic: it is possible to cover a rectangular hole by a round cover fully if
        2 * r >= the diagonal of the rectangular.
         */

        //Step 1: assignment of the hole and cover sizes.
        //rectangular sizes
        Random randRect1 = new Random();
        int rect1 = randRect1.nextInt(9) + 1;
        Random randRect2 = new Random();
        int rect2 = randRect2.nextInt(9) + 1;

        //round cover radius size
        Random randRad = new Random();
        int rad = randRad.nextInt(19) + 1;

        //Step 2: rectangular diagonal calculation
        double sqRect1 = Math.pow(rect1, 2);
        double sqRect2 = Math.pow(rect2, 2);
        double sumSqRect = sqRect1 + sqRect2;
        double diag = Math.sqrt(sumSqRect);

        //Step 3: printing of input values
        System.out.println("Size 'a' of the rectangular: " + rect1 + " cm;" +
                "\nSize 'b' of the rectangular: " + rect2 + " cm;" +
                "\nDiagonal size: " + diag + " cm;" +
                "\nRadius size: " + rad + " cm.");

        //Step 4: verification if it is possible to cover the rectangular hole by the round cover fully
        if (2 * rad >= diag) {
            System.out.println("\nThe round cover is enough large for covering the rectangular hole fully.");
        } else {
            System.out.println("\nThe round cover is NOT enough large for covering the rectangular hole fully.");
        }

    }
}
