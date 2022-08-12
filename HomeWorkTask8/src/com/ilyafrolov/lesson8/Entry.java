package com.ilyafrolov.lesson8;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Entry {

    private String entryText; //2.changed public modifier to private for avoiding changes outside
    private Date curDate; //2.
    private EntryType entryType; //2.

    public Entry(String newEntryText, EntryType newEntryType) {
        this.entryText = newEntryText;
        curDate = new Date();
        this.entryType = newEntryType;
    }

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return entryText + ", [" + EntryType.getEntryTypeAbbrev(entryType) + "] (" + dateFormat.format(curDate) + ")";
    }

    public String getEntryText() {
        return entryText;
    }

    public Date getDate() {
        return curDate;
    }

    public String getEntryType() {
        return EntryType.getEntryTypeAbbrev(entryType);
    }
}
