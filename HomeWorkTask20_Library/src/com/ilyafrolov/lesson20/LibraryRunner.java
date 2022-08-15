package com.ilyafrolov.lesson20;

public class LibraryRunner {
    public static void main(String[] args) {

        Library lib = new Library();

        Book book1 = new Book("Geopolitics", 50);
        lib.addBook(book1);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book2 = new Book("History", 200);
        lib.addBook(book2);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book3 = new Book("Maths", 9);
        lib.addBook(book3);

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Book book4 = new Book("Applied Sciences", 500);
        lib.addBook(book4);

        System.out.println("List of books:");
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("Returning list of books:");
        System.out.println(lib);
        System.out.println("*********************************");

        System.out.println("\nAttempt to add the existing in Library book:");
        Book book5 = new Book("Geopolitics", 50);
        lib.addBook(book5);
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("\nSorted by title list of books:");
        lib.sortByTitle();
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("\nDelete book by id:");
        lib.deleteBook(200);
        lib.printListOfBooks();
        System.out.println("*********************************");

        System.out.println("\nSort book list by date:");
        lib.sortByDate();
        lib.printListOfBooks();
        System.out.println("*********************************");


        System.out.println("\nEdit book by id:");
        lib.editBook(9, "Roma says: YoYoYo");
        lib.printListOfBooks();
        System.out.println("*********************************");
    }
}
