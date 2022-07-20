package com.ilyafrolov.lesson7;

import java.util.Calendar;
import java.util.Date;

public class Notebook {

    /*
    Создать класс записной книжки, в котором хранятся записи дел.
    Создать в этом классе метод, который выводит частотный словарь
    для определенной записи (запись можно определить по номеру/индексу).
    Отсортировать записи, хранящиеся в записной книжке
    по времени их добавления и вывести в этом порядке в консоль.
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
            System.out.println("" + i + ". " + tasks[i] + "  " + curDate[i]);
        }
        return "";
    }

    public void addTask(String newTask) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = newTask;
                curDate[i] = Calendar.getInstance().getTime();
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

    public void reWriteTask(int numberOfTask, String newTask) {
        tasks[numberOfTask - 1] = newTask;
        curDate[numberOfTask - 1] = Calendar.getInstance().getTime();
    }

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
}
