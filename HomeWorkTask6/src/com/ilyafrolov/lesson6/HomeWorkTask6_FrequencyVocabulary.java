package com.ilyafrolov.lesson6;

import java.util.Arrays;

public class HomeWorkTask6_FrequencyVocabulary {
    public static void main(String[] args) {

        /*
        Написать частотный словарь - посчитать сколько раз каждое слово встречается
        в предложении и вывести результат в консоль
         */

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Etiam et dolor nec nisi consequat molestie nec aliquet diam. " +
                "Phasellus vulputate porta ligula, sit amet congue nulla tempus elementum. " +
                "Cras eget est consequat, faucibus sem ut, vehicula massa. " +
                "Cras mollis est at arcu rhoncus, vitae suscipit ante semper. " +
                "Aliquam volutpat commodo dolor. Nullam convallis, " +
                "lorem a pellentesque sodales, lacus neque mattis augue, " +
                "sollicitudin vestibulum risus nulla ut orci. " +
                "Donec vitae condimentum odio, vitae lacinia lacus. " +
                "Fusce fringilla sapien id convallis dictum. " +
                "Ut pellentesque nulla sit amet lorem tincidunt porttitor. " +
                "Suspendisse enim nibh, fringilla at vehicula consectetur, tempus eu mauris.";

        //Step 1: Splitting text and creation of separate words array
        String[] words = text.split("\\W+");
        int[] numberOfRepeats = new int[words.length];

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = i; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        numberOfRepeats[i] += 1;
                    }
                    if (words[i].equals(words[j]) && numberOfRepeats[i] > 1) {
                        words[j] = null;
                        counter += 1;
                    }
                }
            }
        }

        //Step 2: Creation new arrays without repeating words
        String[] words2 = new String[words.length - counter];
        int[] numberOfRepeats2 = new int[words.length - counter];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (words[i] != null) {
                words2[j] = words[i];
                numberOfRepeats2[j] = numberOfRepeats[i];
                j++;
            }
        }

        for (int i = 0; i < words2.length; i++) {
            System.out.println("" + words2[i] + " - " + numberOfRepeats2[i] + " times");
        }
        System.out.println("\nThe program is completed successfully.");
    }
}
