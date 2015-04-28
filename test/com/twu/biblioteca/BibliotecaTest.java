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
        WELCOMEMESSAGE = "Welcome!";
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        biblioteca.displayWelcomeMessage();

        verify(printStream).println(WELCOMEMESSAGE);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        Biblioteca spyBiblioteca = spy(new Biblioteca(printStream, book));

        spyBiblioteca.startApp();

        verify(spyBiblioteca).displayWelcomeMessage();
    }

    @Test
    public void shouldDisplayABook(){
        biblioteca.displayBooks();
        verify(printStream).println(book);
    }

}
