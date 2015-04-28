package com.twu.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private String welcomeMessage = "Welcome!";
    private PrintStream printStream;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayWelcomeMessage() {
        printStream.println(welcomeMessage);
    }

    public void startApp() {
        displayWelcomeMessage();
    }
}
