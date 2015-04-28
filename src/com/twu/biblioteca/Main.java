package com.twu.biblioteca;

public class Main {

    public static void main(String[] args) {
        String book = "Book";
        Biblioteca biblioteca = new Biblioteca(System.out, book);
        biblioteca.startApp();
    }
}
