package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ApplicationTest {
    private Application application;
    private String WELCOMEMESSAGE;
    private PrintStream printStream;
    private ArrayList<String> books;
    private Library library;

    @Before
    public void setUp() {
        books = new ArrayList<String>();
        books.add("Book1");
        books.add("Book2");
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        application = new Application(printStream, books, library);
        WELCOMEMESSAGE = "Welcome";
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        application.startApp();

        verify(printStream).println(contains(WELCOMEMESSAGE));
    }

    @Test
    public void shouldDisplayABook(){
        application.displayBooks();
        verify(printStream).println(books);
    }

    @Test
    public void shouldListBooksWhenApplicationStarts(){
        application.startApp();
        verify(library).listBooks();
    }



}
