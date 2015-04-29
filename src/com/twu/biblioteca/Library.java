package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by cpatel on 4/29/15.
 */
public class Library {
    PrintStream printStream;
    String books;

    public Library(PrintStream printStream, String book1) {
        this.printStream = printStream;
        this.books = book1;
    }

    public void listBooks() {
        printStream.println(books);
    }
}
