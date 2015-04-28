package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by cpatel on 4/28/15.
 */
public class BibliotecaAppTest {

    @Test
    public void displaysWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();

        assertEquals(biblioteca.displayWelcomeMessage(), "Welcome!");
    }
}
