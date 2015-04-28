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

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream);
        WELCOMEMESSAGE = "Welcome!";
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        biblioteca.displayWelcomeMessage();

        verify(printStream).println(WELCOMEMESSAGE);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        Biblioteca spyBiblioteca = spy(new Biblioteca(printStream));

        spyBiblioteca.startApp();

        verify(spyBiblioteca).displayWelcomeMessage();
    }

}
