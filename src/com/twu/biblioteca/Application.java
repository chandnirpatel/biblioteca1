package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Application {

    private String welcomeMessage = "Welcome!";
    private PrintStream printStream;
    private ArrayList<String> books;
    private Library library;

    public Application(PrintStream printStream, ArrayList<String> books, Library library) {
        this.printStream = printStream;
        this.books = books;
        this.library = library;

    }

    private void displayWelcomeMessage() {
        printStream.println(welcomeMessage);
    }

    public void startApp() {
        displayWelcomeMessage();
        library.listBooks();
    }

    public void displayBooks() {
        printStream.println(books);
    }
}
