package com.ilyafrolov.lesson7;

public class TimeInterval {

    /*
    Задание 24
    Создать класс и объекты описывающие промежуток времени. Сам промежуток
    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения
    двух объектов (метод должен работать аналогично compareTo в строках). Создать
    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.
    */

    public int seconds;
    public int minutes;
    public int hours;
    public int totalSeconds;

    public TimeInterval(int seconds) {
        hours = seconds / (60 * 60);
        minutes = (seconds - hours * 60 * 60) / 60;
        this.seconds = (seconds - hours * 60 * 60 - minutes * 60);
        totalSeconds = seconds;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        totalSeconds = (seconds + minutes * 60 + hours * 60 * 60);
        this.hours = totalSeconds / (60 * 60);
        this.minutes = (totalSeconds - this.hours * 60 * 60) / 60;
        this.seconds = (totalSeconds - this.hours * 60 * 60 - this.minutes * 60);
    }

    int calculateTotalSeconds() {
        return totalSeconds = (seconds + minutes * 60 + hours * 60 * 60);
    }

    public void compareToInterval(TimeInterval anotherInterval) {
        int interval1 = totalSeconds;
        int interval2 = anotherInterval.calculateTotalSeconds();
        System.out.println("The first interval is: " + interval1 + " s" +
                "\nThe second interval is: " + interval2 + " s");
        if (interval1 == interval2) {
            System.out.println("\nTime intervals are equal");
        }
        if (interval1 > interval2) {
            System.out.println("\nThe first time interval is longer");
        }
        if (interval1 < interval2) {
            System.out.println("\nThe second time interval is longer");
        }
    }

    public String toString() {
        return "Time interval is: " + hours + " h " + minutes + " min " + seconds + " s";
    }

}
