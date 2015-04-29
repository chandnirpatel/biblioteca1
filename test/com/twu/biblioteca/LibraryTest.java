package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cpatel on 4/29/15.
 */
public class LibraryTest {
    @Test
    public void shouldPrintTitlesWhenPrintingBook() {
        PrintStream printStream = mock(PrintStream.class);
        String book1 = "book1";
        Library library = new Library(printStream, book1);
        library.listBooks();
        verify(printStream).println(contains(book1));
    }
}
