package com.ilyafrolov.lesson20;

public class LibraryRunner {
    public static void main(String[] args) {

        Library lib = new Library();

        Book book1 = new Book("Geopolitics", Genre.POLITICS);
        lib.addBook(book1);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book2 = new Book("History", Genre.HISTORY);
        lib.addBook(book2);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book3 = new Book("Maths", Genre.STUDY);
        lib.addBook(book3);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book4 = new Book("Applied Sciences", Genre.SCIENCE_FICTION);
        lib.addBook(book4);

        System.out.println("List of books:");
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("Returning list of books:");
        System.out.println(lib);
        System.out.println("*********************************");

        System.out.println("\nAdding the book with the same title:");
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book5 = new Book("Geopolitics", Genre.POLITICS);
        lib.addBook(book5);
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("\nSorted by title (ascending) list of books:");
        lib.sortByTitle();
        System.out.println("*********************************");

        System.out.println("\nSorted by title (descending) list of books:");
        lib.sortByTitleReverse();
        System.out.println("*********************************");

        System.out.println("\nSort book list by date:");
        lib.sortByDate();
        System.out.println("*********************************");


        System.out.println("\nDelete book by id:");
        lib.deleteBook(11);
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("\nEdit book by id:");
        lib.editBook(9, "Roma says: YoYoYo");
        lib.printListOfBooks();
        System.out.println("*********************************");
    }
}
