package com.ilyafrolov.lesson11;

public interface NotesStorage {

    /*
    Вынести основные методы работы с записной книжкой в интерфейс
     */
    void addEntry(Entry entry);
    void freqVocab(int indexOfEntry);
    void reWriteEntry(int numberOfEntry, Entry entry);
    void findWord(String keyWord);

}
