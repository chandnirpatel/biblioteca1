package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        String welcomeMessage = biblioteca.displayWelcomeMessage();

        assertEquals(welcomeMessage, "Welcome!");
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        PrintStream printStream = mock(PrintStream.class);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.startApp(printStream);


        verify(printStream).println("Welcome");
    }
}
