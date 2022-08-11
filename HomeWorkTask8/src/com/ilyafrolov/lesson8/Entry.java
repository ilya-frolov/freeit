package com.ilyafrolov.lesson8;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Entry {

    String entry;
    Date curDate;
    EntryType entryType;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Entry(String newEntry, EntryType entryType) {
        this.entry = newEntry;
        curDate = new Date();
        this.entryType = entryType;
    }

    public String toString() {
        return entry + ", [" + EntryType.getEntryTypeAbbrev(entryType) + "] (" + dateFormat.format(curDate) + ")";
    }

    public String getEntry() {
        return entry;
    }

    public Date getDate() {
        return curDate;
    }

    public String getEntryType() {
        return EntryType.getEntryTypeAbbrev(entryType);
    }
}
