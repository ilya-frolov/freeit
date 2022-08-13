package com.ilyafrolov.lesson11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notebook implements NotesStorage {

    private Entry[] entries;
    private int counter;

    public Notebook(int numberOfEntries) {
        entries = new Entry[numberOfEntries];
    }

    public void printNotebook() {
        System.out.println("Existing entries: ");
        for (int i = 0; i < entries.length; i++) {
            System.out.println("" + (i + 1) + ". " + entries[i]);
        }
    }

    public void addEntry(Entry entry) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = entry;
                counter++;
                break;
            } else {
                if (counter == entries.length) {
                    System.out.println("The Notebook is full.");
                    break;
                }
            }
        }
    }

    public void freqVocab(int indexOfEntry) {
        if (indexOfEntry > entries.length - 1) {
            System.out.println("Entered index is out of bounds. Please, choose another one.");
            return;
        }
        //Step 1: Creation of array with words from a task and counting their number
        int counter2 = 0;
        String[] words = entries[indexOfEntry].getEntryText().split("\\W+");
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

    public void reWriteEntry(int numberOfEntry, Entry entry) {
        entries[numberOfEntry - 1] = entry;
    }

    public void sortByDate() {
        for (int i = 0; i < entries.length - 1; i++) {
            int last = i;
            for (int j = i + 1; j < entries.length; j++) {
                if (entries[last].getDate().after(entries[j].getDate())) {
                    last = j;
                }
            }
            Entry tempor = entries[i];
            entries[i] = entries[last];
            entries[last] = tempor;
        }
    }

    public void findWord(String keyWord) {
        String regex = ".*" + keyWord + ".*";
        System.out.println("The word is found in the entry(s): ");
        for (int i = 0; i < entries.length; i++) {
            boolean matches = entries[i].getEntryText().matches(regex);
            if (matches) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    public void findTask(EntryType entryType) {
        String task = entryType.abbrev;
        System.out.println("The entry(s) of this task type: ");
        for (int i = 0; i < entries.length; i++) {
            if (task.equals(entries[i].getEntryType())) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    public void getEntriesInTimeInterval(String dateFromStr, String dateToStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateFrom = dateFormat.parse(dateFromStr);
        Date dateTo = dateFormat.parse(dateToStr);
        System.out.println("\nThe entries in the time interval between " + dateFormat.format(dateFrom) +
                " and " + dateFormat.format(dateTo) + ":");
        for (int i = 0; i < entries.length; i++) {
            if (entries[i].getDate().after(dateFrom) && entries[i].getDate().before(dateTo)) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }
}
