package com.ilyafrolov.lesson8;

import static com.ilyafrolov.lesson8.Notebook.*;
import static com.ilyafrolov.lesson8.Notebook.Tasks.*;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(5);
        System.out.println(notebook);

        notebook.addEntry("Buy clothes", PURCHASES);
        System.out.println(notebook);

        notebook.addEntry("Find job", TODO);
        System.out.println(notebook);

        notebook.addEntry("Call to mother", CALLS);
        System.out.println(notebook);

        notebook.addEntry("Birthday of Misha", BIRTHDAYS);
        System.out.println(notebook);

        notebook.addEntry("Call to wife", CALLS);
        System.out.println(notebook);

        //error due to private modifier in the class Notebook
//        notebook.reWriteEntry(3, "Hi");


        //error due to private modifier in the class Notebook
//        notebook.reWriteEntry(1, "Yo");

        //error due to private modifier in the class Notebook
//        notebook.entries[3] = "buy";

        notebook.findTask(CALLS);

        notebook.getEntriesInTimeInterval(22.07.2022 18:17:18);
    }
}
