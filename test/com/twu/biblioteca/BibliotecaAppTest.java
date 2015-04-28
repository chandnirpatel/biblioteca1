package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {
    private Biblioteca biblioteca;
    private String WELCOMEMESSAGE;

    @Before
    public void setUp(){
        biblioteca = new Biblioteca();
        WELCOMEMESSAGE = "Welcome!";
    }


    @Test
    public void shouldDisplayWelcomeMessage() {
        String welcomeMessage = biblioteca.getWelcomeMessage();

        assertEquals(welcomeMessage, WELCOMEMESSAGE);
    }

    @Test
    public void shouldDisplayWelcomeMessageWhenAppStarts() {
        PrintStream printStream = mock(PrintStream.class);

        biblioteca.displayWelcomeMessage(printStream);

        verify(printStream).println(WELCOMEMESSAGE);
    }
}
