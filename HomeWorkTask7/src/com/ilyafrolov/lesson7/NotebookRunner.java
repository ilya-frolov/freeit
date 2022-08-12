package com.ilyafrolov.lesson7;

import java.util.Calendar;
import java.util.Date;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(5);
        notebook.printNotebook();

        Task task = new Task("Find job");
        notebook.addTask(task);
        notebook.printNotebook();

        Task task2 = new Task("Buy food");
        notebook.addTask(task2);
        notebook.printNotebook();

        Task task3 = new Task("Buy food");
        notebook.addTask(task3);
        notebook.printNotebook();

        Task task4 = new Task("Find job");
        notebook.addTask(task4);
        notebook.printNotebook();

        Task task5 = new Task("Buy food, any food but something taste.");
        notebook.addTask(task5);
        notebook.printNotebook();

        Task task6 = new Task("Find job");
        notebook.addTask(task6);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Task task7 = new Task("Hi");
        notebook.reWriteTask(3, task7);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Task task8 = new Task("Yo");
        notebook.reWriteTask(1, task8);
        notebook.printNotebook();

        notebook.sortByDate();
        notebook.printNotebook();

        notebook.findWord("food");

        notebook.freqVocab(3);
    }

}
