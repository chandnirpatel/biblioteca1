package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * Created by cpatel on 4/29/15.
 */
public class LibraryTest {


    private PrintStream printStream;
    private String book1;
    private Library library;
    private ArrayList<String> books;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        books = new ArrayList<String>();
        book1 = "book1";
        books.add(book1);
        library = new Library(printStream, books);
    }

    @Test
    public void shouldPrintOneTitleWhenListingOneBook() {
        library.listBooks();
        verify(printStream).println(contains(book1));
    }

    @Test
    public void shouldPrintMultipleBooksWhenListingBooks() {
        String book2 = "book2";
        books.add(book2);

        library.listBooks();

        verify(printStream).println(contains(book2));
    }
}
