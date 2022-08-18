package com.ilyafrolov.lesson20;

import java.util.*;

public class Library {

    private Map<String, ArrayList<Book>> books;
    private static int librarySize;

    public Library() {
        books = new TreeMap();
    }

    public void addBook(Book book) {
        if (books.containsKey(book.getTitle())) {
            books.get(book.getTitle()).add(book);
        } else {
            ArrayList<Book> list = new ArrayList();
            list.add(book);
            books.put(book.getTitle(), list);
        }
        librarySize++;
    }

    public static int getLibrarySize() {
        return librarySize;
    }

    public void printListOfBooks() {
        Iterator<ArrayList<Book>> iterator = books.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String toString() {
        return books.values().toString();
    }

    public void deleteBook(int id) {
        for (ArrayList<Book> list : books.values()) {
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    list.remove(i);
                }
            }
        }
    }

    public void editBook(int id, String newTitle) {
        for (ArrayList<Book> list : books.values()) {
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    list.get(i).setTitle(newTitle);
                }
            }
        }
    }

    public void sortByTitleReverse() {
        Map<String, ArrayList<Book>> booksReverseSorted = new TreeMap(Comparator.reverseOrder());
        booksReverseSorted.putAll(books);
        Iterator<ArrayList<Book>> iterator = booksReverseSorted.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sortByDate() {
        ArrayList<ArrayList<Book>> list = new ArrayList<>(books.values());
        ArrayList<Book> booksList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            booksList.addAll(list.get(i));
        }
        booksList.sort(new SortByDate());
        for (Book book : booksList) {
            System.out.println(book);
        }
    }

    public static class SortByDate implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getDate().compareTo(book2.getDate());
        }
    }
}
