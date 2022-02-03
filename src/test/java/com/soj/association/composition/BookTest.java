package com.soj.association.composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testForBookAsSetTitle() {
        Book book1 = new Book("Head First java", " Kathy Sierra");
        book1.setTitle("Head First java");
        Assertions.assertTrue(true, book1.getTitle());
    }

    @Test
    void testForBookAsSetAuthor() {
        Book book1 = new Book("Head First java", " Kathy Sierra");
        book1.setAuthor(" Kathy Sierra");
        Assertions.assertSame(" Kathy Sierra", book1.getAuthor());

    }
}