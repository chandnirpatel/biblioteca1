package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by cpatel on 4/29/15.
 */
public class Library {
    PrintStream printStream;
    ArrayList<String> books;

    public Library(PrintStream printStream, ArrayList<String> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void listBooks() {
        for (String book : books) {
            printStream.println(book);
        }
    }
}
