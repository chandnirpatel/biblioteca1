package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        books.add("Book1");
        books.add("Book2");
        PrintStream printStream = new PrintStream(System.out);
        Library library = new Library(printStream, books);
        Application biblioteca = new Application(System.out, books, library);
        biblioteca.startApp();
    }
}
