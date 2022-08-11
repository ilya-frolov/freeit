package com.ilyafrolov.lesson6;

import java.text.BreakIterator;

public class HomeWorkTask6_FrequencyVocabularySentences {
    public static void main(String[] args) {

        /*
        Написать программу, которая будет хранить текст по предложениям
        и для каждого предложения составить частотный словарь
         */

        String text = "Lorem ipsum ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Aliquam at rhoncus nisi, ut auctor risus nisi. " +
                "Proin ac vestibulum nisi. Praesent ac elementum ac dui sed ac rutrum molestie. " +
                "Curabitur sollicitudin malesuada tincidunt. " +
                "Nulla vestibulum sem ac nulla sem congue, sed feugiatsem  mi porta sem. " +
                "Maecenas semper vel viverra risus, vel commodo vel purus vel maximus non. " +
                "In luctus nisi sit amet est sagittis dictum.";

        //Step 1: Splitting text into sentences and counting the number of them
        BreakIterator bi = BreakIterator.getSentenceInstance();
        bi.setText(text);
        int index = 0;
        int counter = 0;
        while (bi.next() != BreakIterator.DONE) {
            String sentence = text.substring(index, bi.current());
            index = bi.current();
            counter += 1;
        }

        //Step 2: Creating an array with the sentences
        bi.setText(text);
        String[] sentences = new String[counter];
        int index2 = 0;
        int k = 0;
        while (bi.next() != BreakIterator.DONE) {
            String sentence = text.substring(index2, bi.current());
            index2 = bi.current();
            sentences[k] = sentence;
            System.out.println("" + sentences[k]);
            k++;
        }

        //Step 3: Splitting each sentence into separate words and combining them to 2D array
        String[][] words = new String[k][];
        for (int i = 0; i < words.length; i++) {
            words[i] = new String[sentences[i].split("\\W+").length];
            for(int j = 0; j < words[i].length; j++) {
                words[i][j] = sentences[i].split("\\W+")[j];
            }
        }

        //Step 4: Creating an array for counting number of word repeating
        int[][] numberOfRepeats = new int[k][];
        for (int i = 0; i < words.length; i++) {
            numberOfRepeats[i] = new int[words[i].length];
        }

        //Step 5: Counting repeating number for each word in each sentence
        int[] counter2 = new int[k];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j] != null) {
                    for (int l = 0; l < words[i].length; l++) {
                        if (words[i][j].equals(words[i][l])) {
                            numberOfRepeats[i][j] += 1;
                        }
                        if (words[i][j].equals(words[i][l]) && numberOfRepeats[i][j] > 1) {
                            words[i][l] = null;
                            counter2[i] += 1;
                        }
                    }
                }
            }
        }

        //Step 6: Creating new arrays without repeating words
        String[][] words2 = new String[k][];
        int[][] numberOfRepeats2 = new int[k][];

        for (int i = 0; i < words.length; i++) {
            int n = words[i].length - counter2[i];
            words2[i] = new String[n];
            numberOfRepeats2[i] = new int[n];
            int l = 0;
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j] != null) {
                    words2[i][l] = words[i][j];
                    numberOfRepeats2[i][l] = numberOfRepeats[i][j];
                    l++;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println("\nSentence " + (i + 1) + " consists of the words:");
            for (int j = 0; j < words2[i].length; j++) {
                System.out.println("" + words2[i][j] + " - repeats " + numberOfRepeats2[i][j] + " time(s)");
            }
        }
        System.out.println("\nThe program is completed successfully.");

    }
}

