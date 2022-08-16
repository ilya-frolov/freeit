package com.ilyafrolov.lesson20;

import java.util.*;

public class Library {

    private Map<String, ArrayList<Book>> books;
    private ArrayList<Book> list;
    private ArrayList<String> titleList;

    public Library() {
        books = new HashMap();
    }

    public void addBook(Book book) {
        book.setId(books.size() + 7);
        if (books.containsKey(book.getTitle())) {
            books.get(book.getTitle()).add(book);
        } else {
            list = new ArrayList();
            list.add(book);
            books.put(book.getTitle(), list);
        }
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
        titleList = new ArrayList(books.keySet());
        for (int i = 0; i < titleList.size(); i++) {
            for (int j = 0; j < books.get(titleList.get(i)).size(); j++) {
                if (books.get(titleList.get(i)).get(j).getId() == id) {
                    books.get(titleList.get(i)).remove(j);
                    break;
                }
            }
        }
    }

    public void editBook(int id, String newTitle) {
        titleList = new ArrayList(books.keySet());
        for (int i = 0; i < titleList.size(); i++) {
            for (int j = 0; j < books.get(titleList.get(i)).size(); j++) {
                if (books.get(titleList.get(i)).get(j).getId() == id) {
                    books.get(titleList.get(i)).get(j).setTitle(newTitle);
                    break;
                }
            }
        }
    }

    public void sortByTitle() {
        titleList = new ArrayList(books.keySet());
        Collections.sort(titleList, new Book.sortByTitle());
        for (int i = 0; i < titleList.size(); i++) {
            System.out.println(books.get(titleList.get(i)));
        }
    }

    public void sortByTitleReverse() {
        titleList = new ArrayList(books.keySet());
        Collections.sort(titleList, new Book.sortByTitleReverse());
        for (int i = 0; i < titleList.size(); i++) {
            System.out.println(books.get(titleList.get(i)));
        }
    }

    public void sortByDate() {
        titleList = new ArrayList(books.keySet());
        list = new ArrayList();
        for (int i = 0; i < titleList.size(); i++) {
            for (int j = 0; j < books.get(titleList.get(i)).size(); j++) {
                list.add(books.get(titleList.get(i)).get(j));
            }
        }
        Collections.sort(list, new Book.sortByDate());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
