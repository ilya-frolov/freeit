package com.ilyafrolov.lesson8;

import java.text.ParseException;

import static com.ilyafrolov.lesson8.EntryType.*;

public class NotebookRunner {
    public static void main(String[] args) throws ParseException {
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

        notebook.getEntriesInTimeInterval("11", "08", "2022", "12", "08", "2022");
    }
}
