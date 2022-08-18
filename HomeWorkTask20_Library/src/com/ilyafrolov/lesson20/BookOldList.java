package com.ilyafrolov.lesson20;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class BookOldList implements Comparable<Book> {

    private int id;
    private String title;
    private String genre;
    private Date date;

    public BookOldList(String title, int id) {
//        Random random = new Random();
//        id = random.nextInt(999) + 1;
        this.id = id;
        this.title = title;
//        this.genre = new Genre().getGenre(id);
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
        return "Title: " + title + ", id: " + id + ", genre: " + genre + " |||";
    }

    // For case of HashSet Library
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Book book = (Book) o;
//        return id == book.id && Objects.equals(title, book.title) && Objects.equals(genre, book.genre);
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (genre == null ? 0 : genre.hashCode());
        return hash;
    }

    // For case of List Library
    @Override
    public int compareTo(Book book) {
        if (getTitle() == null || book.getTitle() == null) {
            return 0;
        }
        return getTitle().compareTo(book.getTitle());
    }
}
