package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private String WELCOMEMESSAGE;
    private PrintStream printStream;
    private String book;

    @Before
    public void setUp(){
        book = "Book";
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream, book);
        WELCOMEMESSAGE = "Welcome";
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        biblioteca.startApp();

        verify(printStream).println(contains(WELCOMEMESSAGE));
    }

    @Test
    public void shouldDisplayABook(){
        biblioteca.displayBooks();
        verify(printStream).println(book);
    }

}
