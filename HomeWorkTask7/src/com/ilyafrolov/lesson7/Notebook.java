package com.ilyafrolov.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {

    /*
    - Создать класс записной книжки, в котором хранятся записи дел.
    1. Создать в этом классе метод, который выводит частотный словарь
       для определенной записи (запись можно определить по номеру/индексу).
    2. Отсортировать записи, хранящиеся в записной книжке
       по времени их добавления и вывести в этом порядке в консоль.
    3. Написать в классе записной книжки метод, который выводит в консоль
       название всех дел/сами дела, в которых есть переданное в этот метод
       в качестве аргумента слово
     */

    public Task[] tasks;
    public int counter;

    public Notebook(int numberOfTasks) {
        tasks = new Task[numberOfTasks];
    }

    public String toString() {
        System.out.println("Existing tasks: ");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("" + (i + 1) + ". " + tasks[i]);
        }
        return "";
    }

    public void addTask(String newTask) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = new Task(newTask);
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

    //1
    public void freqVocab(int indexOfTask) {
        //Step 1: Creation of array with words from a task and counting their number
        int counter2 = 0;
        String[] words = tasks[indexOfTask].getTask().split("\\W+");
        int[] numberOfRepeats = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = i; j < words.length; j++) {
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
        for (int i = 0, j = 0; i < words.length; i++) {
            if (words[i] != null) {
                words2[j] = words[i];
                numberOfRepeats2[j] = numberOfRepeats[i];
                System.out.println("" + words2[j] + " - " + numberOfRepeats2[j] + " time(s)");
                j++;
            }
        }
    }

    public void reWriteTask(int numberOfTask, String newTask) {
        tasks[numberOfTask - 1] = new Task(newTask);
    }

    //2.
    public void sortByDate() {
        for (int i = 0; i < tasks.length - 1; i++) {
            int last = i;
            for (int j = i + 1; j < tasks.length; j++) {
                if (tasks[last].getDate().after(tasks[j].getDate())) {
                    last = j;
                }
            }
            Task tempor = tasks[i];
            tasks[i] = tasks[last];
            tasks[last] = tempor;
        }
    }

    //3.
    public void findWord(String keyWord) {
        Pattern pattern = Pattern.compile(".*" + keyWord + ".*");
        System.out.println("The word is found in the task(s): ");
        for (int i = 0; i < tasks.length; i++) {
            Matcher matcher = pattern.matcher(tasks[i].getTask());
            if (matcher.matches()) {
                System.out.println("" + (i + 1) + ". " + tasks[i]);
            }
        }
    }
}

