package com.ilyafrolov.lesson20;

import java.util.*;

public class Library {

    List<Book> books;

    public Library() {
        books = new LinkedList();
    }

    public void addBook(Book book) {
        boolean isUnique = true;
        if (books.size() == 0) {
            books.add(book);
        } else {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(book)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                books.add(book);
            }
        }
    }

    public void printListOfBooks() {
        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String toString() {
        return books.toString();
    }

    public void sortByTitle() {
        Collections.sort(books);
    }

    public void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(books.get(i));
            }
        }
    }

    public void editBook(int id, String newTitle) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.get(i).setTitle(newTitle);
            }
        }
    }

    public void sortByDate() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book2.getDate().compareTo(book1.getDate());
            }
        });
    }
}
