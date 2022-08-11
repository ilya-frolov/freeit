package com.ilyafrolov.lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {

    /*
    1. Добавить каждой записи в записной книге поле типа (еnum):
    покупки/дела/звонки/день рождения и т.п.
    2. Защитить записи от возможности изменения "снаружи".
    3. Создать метод, возвращающий все записи переданного в метод типа.
    4. Создать метод, возвращающий все записи в заданном промежутке времени.
     */

    //2.
    private Entry[] entries; //2.changed public modifier to private for avoiding changes outside
    public int counter;

    public Notebook(int numberOfEntries) {
        entries = new Entry[numberOfEntries];
    }

    public String toString() {
        System.out.println("Existing entries: ");
        for (int i = 0; i < entries.length; i++) {
            System.out.println("" + (i + 1) + ". " + entries[i]);
        }
        return "";
    }

    //1.
    public void addEntry(String newEntry, EntryType entryType) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = new Entry(newEntry, entryType);
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
        //Step 1: Creation of array with words from a task and counting their number
        int counter2 = 0;
        String[] words = entries[indexOfEntry].getEntry().split("\\W+");
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

    //2.
    private void reWriteEntry(int numberOfEntry, String newEntry, EntryType entryType) { //2.changed public modifier to private for avoiding changes outside
        entries[numberOfEntry - 1] = new Entry(newEntry, entryType);
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
        Pattern pattern = Pattern.compile(".*" + keyWord + ".*");
        System.out.println("The word is found in the entry(s): ");
        for (int i = 0; i < entries.length; i++) {
            Matcher matcher = pattern.matcher(entries[i].getEntry());
            if (matcher.matches()) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    //3.
    public void findTask(EntryType entryType) {
        String task = entryType.abbrev;
        System.out.println("The entry(s) of this task type: ");
        for (int i = 0; i < entries.length; i++) {
            if (task.equals(entries[i].getEntryType())) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    //4.
    public void getEntriesInTimeInterval(String dateFromDD, String dateFromMM, String dateFromYYYY, String dateToDD, String dateToMM, String dateToYYYY) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateFromStr = "" + dateFromDD + "." + dateFromMM + "." + dateFromYYYY;
        Date dateFrom = dateFormat.parse(dateFromStr);
        String dateToStr = "" + dateToDD + "." + dateToMM + "." + dateToYYYY;
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
