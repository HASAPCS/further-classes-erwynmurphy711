package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testAddAndFindBook() {
        Library library = new Library();
        Book book = new Book("Sample Title", "Sample Author", "1234567890");
        library.addBook(book);
        assertEquals(book, library.findBookByISBN("1234567890"));
    }

}
