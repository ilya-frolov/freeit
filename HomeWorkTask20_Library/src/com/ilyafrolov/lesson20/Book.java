package com.ilyafrolov.lesson20;

import java.util.Date;
import java.util.Objects;

public class Book {

    private final int id;
    private String title;
    private final Genre genre;
    private final Date date;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
        id = Library.getLibrarySize() + 1;
        date = new Date();
    }

    public int getId() {
        return id;
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

}
