package com.ilyafrolov.lesson7;

import java.util.Calendar;
import java.util.Date;
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

    public String[] tasks;
    public int counter;
    public Date[] curDate;

    public Notebook(int numberOfTasks) {
        tasks = new String[numberOfTasks];
        curDate = new Date[tasks.length];
    }

    public String toString() {
        System.out.println("Existing tasks: ");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("" + (i + 1) + ". " + tasks[i] + "  " + curDate[i]);
        }
        return "";
    }

    public void addTask(String newTask) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = newTask;
                curDate[i] = new Date();
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

    //The next method is only for changing the date of new rewrited tasks
    public void reWriteTask(int numberOfTask, String newTask) {
        tasks[numberOfTask - 1] = newTask;
        curDate[numberOfTask - 1] = new Date();
    }

    //2.
    public void sortByDate() {
        for (int i = 0; i < curDate.length - 1; i++) {
            int last = i;
            for (int j = i + 1; j < curDate.length; j++) {

                if (curDate[last].after(curDate[j])) {
                    last = j;
                }
            }
            String tempor = tasks[i];
            tasks[i] = tasks[last];
            tasks[last] = tempor;
            Date tempor2 = curDate[i];
            curDate[i] = curDate[last];
            curDate[last] = tempor2;
        }
    }

    //3.
    public void findWord(String keyWord) {
        Pattern pattern = Pattern.compile(".*" + keyWord + ".*");
        System.out.println("The word is found in the task(s): ");
        for (int i = 0; i < tasks.length; i++) {
            Matcher matcher = pattern.matcher(tasks[i]);
            if (matcher.matches()) {
                System.out.println("" + (i + 1) + ". " + tasks[i]);
            }
        }
    }
}

