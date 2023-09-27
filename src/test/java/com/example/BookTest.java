package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void testBookInitialization() {
        Book book = new Book("Sample Title", "Sample Author", "1234567890");
        assertEquals("Sample Title", book.getTitle());
        assertEquals("Sample Author", book.getAuthor());
        assertEquals("1234567890", book.getISBN());
        assertFalse(book.isCheckedOut());
    }
}
