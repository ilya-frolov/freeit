package com.ilyafrolov.lesson8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    private String[] entries; //2.changed public modifier to private for avoiding changes outside
    public int counter;
    public Date[] curDate;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
    public String[] types;
    //4.
    public Date dateFrom;
    public Date dateTo;

    public Notebook(int numberOfEntries) {
        entries = new String[numberOfEntries];
//        curDate = new Date[entries.length];
        types = new String[entries.length];
    }

    public String toString() {
        System.out.println("Existing entries: ");
        for (int i = 0; i < entries.length; i++) {
            System.out.println("" + (i + 1) + ". " + entries[i] + "  " + dateFormat.format(curDate[i]) + " Type: " + types[i]);
        }
        return "";
    }

    public void addEntry(String newTask) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = newTask;
                curDate[i] = new Date();
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

    //1.
    public void addEntry(String newTask, Tasks taskType) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = newTask;
                curDate[i] = new Date();
                types[i] = taskType.abbrev; //1.
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
        //Step 1: Creation of array with words form a task a counting their number
        int counter2 = 0;
        String[] words = entries[indexOfEntry].split("\\W+");
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

    //2.
    //The next method is only for changing the date of new rewritten entries
    private void reWriteEntry(int numberOfEntry, String newEntry) { //2.changed public modifier to private for avoiding changes outside
        entries[numberOfEntry - 1] = newEntry;
        curDate[numberOfEntry - 1] = new Date();
    }

    public void sortByDate() {
        for (int i = 0; i < curDate.length - 1; i++) {
            int last = i;
            for (int j = i + 1; j < curDate.length; j++) {
                if (curDate[last].after(curDate[j])) {
                    last = j;
                }
            }
            String tempor = entries[i];
            entries[i] = entries[last];
            entries[last] = tempor;
            Date tempor2 = curDate[i];
            curDate[i] = curDate[last];
            curDate[last] = tempor2;
        }
    }

    public void findWord(String keyWord) {
        Pattern pattern = Pattern.compile(".*" + keyWord + ".*");
        System.out.println("The word is found in the entry(s): ");
        for (int i = 0; i < entries.length; i++) {
            Matcher matcher = pattern.matcher(entries[i]);
            if (matcher.matches()) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    //3.
    public void findTask(Tasks taskType) {
        String task = taskType.abbrev;
        System.out.println("The entry(s) of this task type: ");
        for (int i = 0; i < types.length; i++) {
            if (task.equals(types[i])) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    //4.
    public void getEntriesInTimeInterval(Date dateFrom, Date dateTo) {
        long dateFromMillis = dateFrom.getTime();
        long dateToMillis = dateTo.getTime();
        System.out.println("The entries in the time interval between " + dateFrom +
                " and " + dateTo + ":");
        for (int i = 0; i < curDate.length; i++) {
            if (curDate[i].after(dateFromMillis) && curDate[i].before(dateToMillis)) {
                System.out.println("" + (i + 1) + ". " + entries[i]);
            }
        }
    }

    //1.
    public enum Tasks {
        PURCHASES("Purchases"),
        TODO("Tasks to-do"),
        CALLS("Calls"),
        BIRTHDAYS("Birthdays");

        final String abbrev;
        private final static String[] tasks = new String[Tasks.values().length];

        Tasks(String abbrev) {
            this.abbrev = abbrev;
        }

        public static void getAbbrev() {
            for (int i = 0; i < tasks.length; i++) {
                tasks[i] = Tasks.values()[i].abbrev;
                System.out.println("" + tasks[i]);
            }
//            Tasks[] tasks = Tasks.values();
        }
    }
}
