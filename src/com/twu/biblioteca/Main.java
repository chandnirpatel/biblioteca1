package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        Application biblioteca = new Application(System.out, books, new Library(new PrintStream(System.out), "book1"));
        biblioteca.startApp();
    }
}
