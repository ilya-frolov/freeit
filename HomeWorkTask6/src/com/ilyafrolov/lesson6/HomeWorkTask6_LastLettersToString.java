package com.ilyafrolov.lesson6;

public class HomeWorkTask6_LastLettersToString {
    public static void main(String[] args) {

        /*
        Задание 20
        Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
         */

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Pellentesque id luctus massa. Sed aliquet nisi id justo maximus dictum. " +
                "Vivamus malesuada lacus augue, nec ornare nibh efficitur varius. " +
                "Curabitur tincidunt nibh sed malesuada faucibus. " +
                "Nullam non pretium mauris, ac blandit nisl. " +
                "Pellentesque sit amet tellus in tortor cursus facilisis sit amet eu arcu. " +
                "Mauris eget pretium sapien. Suspendisse varius molestie sollicitudin. " +
                "Aliquam in congue erat. Sed maximus volutpat hendrerit.";

        String[] words = text.split("\\W+");
        System.out.println("Sentence made of last letters of each word:");
        for (int i = 0; i < words.length; i++) {
            System.out.print("" + words[i].charAt(words[i].length() - 1));
        }
        System.out.println("\n\nThe program is completed successfully.");
    }
}
