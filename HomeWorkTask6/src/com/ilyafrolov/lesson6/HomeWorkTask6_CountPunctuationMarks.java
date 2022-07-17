package com.ilyafrolov.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWorkTask6_CountPunctuationMarks {
    public static void main(String[] args){

        /*
        Задание 18
        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
        общее их количество.
         */

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Cras dapibus facilisis rutrum. Aliquam facilisis ante at lectus efficitur tempus. " +
                "Praesent vestibulum felis molestie congue scelerisque. " +
                "Integer vulputate facilisis urna. Pellentesque pulvinar quis elit sed dapibus. " +
                "Etiam tristique nisl vel cursus suscipit. " +
                "Cras luctus, magna mattis scelerisque cursus, sem odio imperdiet enim, " +
                "non tempus orci ex ut ex. Nunc erat justo, maximus vel nisi ac, " +
                "suscipit facilisis urna. Nulla nec dui fringilla, sodales purus in, " +
                "molestie ex. Phasellus lobortis nulla neque, nec vestibulum tellus varius ac. " +
                "Integer volutpat feugiat hendrerit. Morbi fermentum, massa nec venenatis posuere, " +
                "turpis dui viverra nisl, et feugiat massa nisi nec sem.";

        String regex = "\\p{Punct}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        System.out.println("The number of punctuation marks in the text is: " + counter);
    }
}
