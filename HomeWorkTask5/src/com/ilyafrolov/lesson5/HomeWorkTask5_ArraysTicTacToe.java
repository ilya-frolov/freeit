package com.ilyafrolov.lesson5;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTask5_ArraysTicTacToe {
    public static void main(String[] args) {

        /*
        Написать игру крестики нолики
         */

        //Step 1: Creation of 3x3 array
        String[][] ttt = new String[3][3]; //String because we need nulls in cells

        //Step 2: Playing Tic-tac-toe
        Scanner input = new Scanner(System.in);
        System.out.println("The pattern of 'row_column' indexes:\n0_0 0_1 0_2\n1_0 1_1 1_2\n2_0 2_1 2_2");

        int counter = 0;
        boolean allCells = true;
        while (allCells) {
            boolean draw = true; // verification for the draw case
            boolean cross = true;
            while (cross) {
                System.out.println("\nEnter the row index of the filling cell: ");
                int n1 = input.nextInt();
                System.out.println("Enter the column index of the filling cell: ");
                int n2 = input.nextInt();

                if (n1 > 2 || n2 > 2 || n1 < 0 || n2 < 0) {
                    System.out.println("\nThe chosen number is out of limits!");
                }

                if (ttt[n1][n2] == null) {
                    ttt[n1][n2] = "+";
                    counter++;
                    cross = false;
                } else {
                    System.out.println("\nThe chosen cell has already been filled");
                }
            }

            boolean zero = true;
            while (zero) {
                Random cr = new Random();
                int cr1 = cr.nextInt(3);
                int cr2 = cr.nextInt(3);

                if (counter == 5) { //verification if all cells are already filled
                    zero = false;
                }

                if (ttt[cr1][cr2] == null) {
                    ttt[cr1][cr2] = "0";
                    zero = false;
                }
            }

            // Verification if winning by filling a row
            for (int i = 0; i < ttt.length; i++) {
                int counter2 = 0;
                for (int i1 = 0; i1 < ttt[i].length; i1++) {
                    if (ttt[i][i1] == "+") {
                        counter2++;
                        if (counter2 == 3) {
                            allCells = false;
                            System.out.println("\nYou've won!!!");
                            draw = false;
                            break;
                        }
                    }
                }
                int counter3 = 0;
                for (int i1 = 0; i1 < ttt[i].length; i1++) {
                    if (ttt[i][i1] == "0") {
                        counter3++;
                        if (counter3 == 3) {
                            allCells = false;
                            System.out.println("\nComputer's won!!!");
                            draw = false;
                            break;
                        }
                    }
                }
            }

            // Verification if winning by filling a column
            for (int i1 = 0; i1 < ttt[1].length; i1++) {
                int counter2 = 0;
                for (int i = 0; i < ttt.length; i++) {
                    if (ttt[i][i1] == "+") {
                        counter2++;
                        if (counter2 == 3) {
                            allCells = false;
                            System.out.println("\nYou've won!!!");
                            draw = false;
                            break;
                        }
                    }
                }
                int counter3 = 0;
                for (int i = 0; i < ttt.length; i++) {
                    if (ttt[i][i1] == "0") {
                        counter3++;
                        if (counter3 == 3) {
                            allCells = false;
                            System.out.println("\nComputer's won!!!");
                            draw = false;
                            break;
                        }
                    }
                }
            }

            // Verification if winning by filling the first diagonal
            int counter2 = 0;
            int counter3 = 0;
            for (int i = 0; i < ttt.length; i++) {
                for (int i1 = 0; i1 < ttt[i].length; i1++) {
                    if (i == 0 && i1 == 2 || i == 1 && i1 == 1 || i == 2 && i1 == 0) {
                        if (ttt[i][i1] == "+") {
                            counter2++;
                            if (counter2 == 3) {
                                allCells = false;
                                System.out.println("\nYou've won!!!");
                                draw = false;
                                break;
                            }
                        }
                        if (ttt[i][i1] == "0") {
                            counter3++;
                            if (counter3 == 3) {
                                allCells = false;
                                System.out.println("\nComputer's won!!!");
                                draw = false;
                                break;
                            }
                        }
                    }
                }
            }

            // Verification if winning by filling the second diagonal
            int counter4 = 0;
            int counter5 = 0;
            for (int i = 0; i < ttt.length; i++) {
                for (int i1 = 0; i1 < ttt[i].length; i1++) {
                    if (i == i1) {
                        if (ttt[i][i1] == "+") {
                            counter4++;
                            if (counter4 == 3) {
                                allCells = false;
                                System.out.println("\nYou've won!!!");
                                draw = false;
                                break;
                            }
                        }
                        if (ttt[i][i1] == "0") {
                            counter5++;
                            if (counter5 == 3) {
                                allCells = false;
                                System.out.println("\nComputer's won!!!");
                                draw = false;
                                break;
                            }
                        }
                    }
                }
            }

            // The case when we drew
            if (counter == 5 && draw) {
                allCells = false;
                System.out.println("\nDraw!!!");
            }

            System.out.println("\nThe current state of the array:");
            for (int i = 0; i < ttt.length; i++) {
                for (int i1 = 0; i1 < ttt[i].length; i1++) {
                    System.out.print(ttt[i][i1] + "     ");
                }
                System.out.print("\n");
            }
        }
        System.out.println("\nThe game is finished.");
    }
}
