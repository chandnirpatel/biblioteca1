package com.twu.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private String welcomeMessage = "Welcome!";
    private PrintStream printStream;
    private String books;

    public Biblioteca(PrintStream printStream, String books) {
        this.printStream = printStream;
        this.books = books;

    }


    private void displayWelcomeMessage() {
        printStream.println(welcomeMessage);
    }

    public void startApp() {
        displayWelcomeMessage();
    }

    public void displayBooks() {
        printStream.println(books);
    }
}
