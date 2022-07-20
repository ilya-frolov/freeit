package com.ilyafrolov.lesson7;

import java.util.Calendar;
import java.util.Date;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(5);
        System.out.println(notebook);

        notebook.addTask("Find job");
        System.out.println(notebook);

        notebook.addTask("Buy food");
        System.out.println(notebook);

        notebook.addTask("Buy food");
        System.out.println(notebook);

        notebook.addTask("Find job");
        System.out.println(notebook);

        notebook.addTask("Buy food, any food but something taste.");
        System.out.println(notebook);

        notebook.addTask("Find job");
        System.out.println(notebook);

        notebook.freqVocab(4);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        notebook.reWriteTask(3, "Hi");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        notebook.reWriteTask(1, "Yo");
        System.out.println(notebook);

        notebook.sortByDate();
        System.out.println(notebook);
    }

}
