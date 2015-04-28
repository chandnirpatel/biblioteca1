package com.twu.biblioteca;

import java.io.PrintStream;

public class Biblioteca {
    public String displayWelcomeMessage() {
        return "Welcome!";
    }

    public void startApp(PrintStream printStream) {
        printStream.println("Welcome");
    }
}
