package com.ilyafrolov.lesson7;

public class Notebook {

    /*
    Создать класс записной книжки, в котором хранятся записи дел.
    Создать в этом классе метод, который выводит частотный словарь
    для определенной записи (запись можно определить по номеру/индексу).
     */

    public String[] tasks;
    public int counter;

    public Notebook(int numberOfTasks) {
        tasks = new String[numberOfTasks];
    }

    public String toString() {
        System.out.println("Existing tasks: ");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("" + i + ". " + tasks[i]);
        }
        return "";
    }

    public void addTask(String newTask) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = newTask;
                counter++;
                break;
            } else {
                if (counter == tasks.length) {
                    System.out.println("The Notebook is full.");
                    break;
                }
            }
        }
    }

    public void freqVocab(int indexOfTask) {
        //Step 1: Creation of array with words form a task a counting their number
        int counter2 = 0;
        String[] words = tasks[indexOfTask].split("\\W+");
        int[] numberOfRepeats = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        numberOfRepeats[i] += 1;
                    }
                    if (words[i].equals(words[j]) && numberOfRepeats[i] > 1) {
                        words[j] = null;
                        counter2 += 1;
                    }
                }
            }
        }
        //Step 2: Creation of arrays without repeating words at printing
        String[] words2 = new String[words.length - counter2];
        int[] numberOfRepeats2 = new int[words.length - counter2];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                words2[j] = words[i];
                numberOfRepeats2[j] = numberOfRepeats[i];
                System.out.println("" + words2[j] + " - " + numberOfRepeats2[j] + " time(s)");
                j++;
            }
        }
    }
}
