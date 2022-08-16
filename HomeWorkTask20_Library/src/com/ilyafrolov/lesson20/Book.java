package com.ilyafrolov.lesson20;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Book {

    private int id;
    private String title;
    private Genre genre;
    private Date date;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
        date = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return "Title: " + title + ", id: " + id + ", genre: " + genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id && Objects.equals(title, book.title) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (genre == null ? 0 : genre.hashCode());
        return hash;
    }

    public static class sortByTitle implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }

    public static class sortByTitleReverse implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str2.compareTo(str1);
        }
    }

    public static class sortByDate implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getDate().compareTo(book2.getDate());
        }
    }
}
