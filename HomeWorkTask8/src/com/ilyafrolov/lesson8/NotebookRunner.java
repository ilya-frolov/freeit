package com.ilyafrolov.lesson8;

import java.text.ParseException;

import static com.ilyafrolov.lesson8.EntryType.*;

public class NotebookRunner {
    public static void main(String[] args) throws ParseException {
        Notebook notebook = new Notebook(5);
        notebook.printNotebook();

        Entry entry = new Entry("Buy clothes", PURCHASES);

        notebook.addEntry(entry);
        notebook.printNotebook();

        Entry entry2 = new Entry("Find job", TODO);

        notebook.addEntry(entry2);
        notebook.printNotebook();

        Entry entry3 = new Entry("Call to mother", CALLS);

        notebook.addEntry(entry3);
        notebook.printNotebook();

        Entry entry4 = new Entry("Birthday of Misha", BIRTHDAYS);

        notebook.addEntry(entry4);
        notebook.printNotebook();

        Entry entry5 = new Entry("Call to wife", CALLS);

        notebook.addEntry(entry5);
        notebook.printNotebook();

        //error due to private modifier in the class Notebook
        Entry entry6 = new Entry("Hi", TODO);
//        notebook.reWriteEntry(3, entry6);


        //error due to private modifier in the class Notebook
        Entry entry7 = new Entry("Yo", TODO);
//        notebook.reWriteEntry(1, entry7);

        //error due to private modifier in the class Notebook
//        notebook.entries[3] = "buy";

        notebook.findTask(CALLS);

        notebook.getEntriesInTimeInterval("12.08.2022", "13.08.2022");
    }
}
