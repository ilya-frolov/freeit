package com.ilyafrolov.lesson7;

import java.util.Random;

public class ATM {

    /*
    Задание 25
    Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
    50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    снимающую деньги. На вход передается сумма денег. На выход – булевское
    значение (операция удалась или нет). При снятии денег функция должна
    распечатывать каким количеством купюр какого номинала выдается сумма. Создать
    конструктор с тремя параметрами – количеством купюр.
     */

    public int num20;
    public int num50;
    public int num100;
    public int totalSum;
    public int numExit20;
    public int numExit50;
    public int numExit100;
    public int exitSum;

    public ATM(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public String toString() {
        return "The number of 20 bills is: " + num20 + "; of 50 bills is: "
                + num50 + "; of 100 bills is: " + num100 + ".";
    }

    public void addMoneyToATM(int num20, int num50, int num100) {
        this.num20 += num20;
        this.num50 += num50;
        this.num100 += num100;
    }

    public boolean withdrawMoneyFromATM(int sum) {
        totalSum = num20 * 20 + num50 * 50 + num100 * 100;
        if (sum <= totalSum) {
            System.out.println("The required amount of money is accepted.");
            while (exitSum % sum != 0 || exitSum == 0) {
                exitSum = 0;
                numExit20 = 0;
                numExit50 = 0;
                numExit100 = 0;
                Random rand1 = new Random();
                numExit100 = rand1.nextInt(sum / 100);
                exitSum = numExit20 * 20 + numExit50 * 50 + numExit100 * 100;
                if (exitSum != sum) {
                    Random rand2 = new Random();
                    numExit50 = rand2.nextInt((sum - exitSum) / 50);
                }
                exitSum = numExit20 * 20 + numExit50 * 50 + numExit100 * 100;
                if (exitSum != sum) {
                    numExit20 = (sum - numExit100 * 100 - numExit50 * 50) / 20;
                }
                exitSum = numExit20 * 20 + numExit50 * 50 + numExit100 * 100;
            }
            System.out.println("The number of 20 bills is: " + numExit20 + "; of 50 bills is: "
                    + numExit50 + "; of 100 bills is: " + numExit100 + ".");
            return true;
        } else {
            System.out.println("The required amount of money is not accepted.");
            System.out.println("The maximum possible sum for withdrawing is: " + totalSum + ".");
            return false;
        }
    }
}
