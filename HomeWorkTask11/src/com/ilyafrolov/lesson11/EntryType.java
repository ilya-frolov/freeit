package com.ilyafrolov.lesson11;

public enum EntryType {
    PURCHASES("Purchases"),
    TODO("Tasks to-do"),
    CALLS("Calls"),
    BIRTHDAYS("Birthdays");

    final String abbrev;

    EntryType(String abbrev) {
        this.abbrev = abbrev;
    }

    public static String getEntryTypeAbbrev(EntryType entryType) {
        return entryType.abbrev;
    }
}
