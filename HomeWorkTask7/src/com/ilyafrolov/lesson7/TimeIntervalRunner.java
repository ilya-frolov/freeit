package com.ilyafrolov.lesson7;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(123, 555, 718);

        System.out.println(interval1);
        System.out.println(interval1.calculateTotalSeconds());

        TimeInterval interval2 = new TimeInterval(476819);
        System.out.println(interval2);

        interval1.compareToInterval(interval2);
    }
}
