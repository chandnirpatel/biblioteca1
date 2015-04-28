package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        String welcomeMessage = biblioteca.displayWelcomeMessage();

        assertEquals(welcomeMessage, "Welcome!");
    }
}
