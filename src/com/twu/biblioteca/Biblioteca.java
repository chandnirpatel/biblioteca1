package com.twu.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private String welcomeMessage = "Welcome!";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void displayWelcomeMessage(PrintStream printStream) {
        printStream.println(getWelcomeMessage());
    }
}
