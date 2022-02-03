package com.soj.association.composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testForGettingTotalBooksInLibrary() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Head First java", " Kathy Sierra");
        Book book2 = new Book("Clean Code", "Robert.C.Martin");
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(bookList);
        List<Book> books = library.getTotalBooksInLibrary();
        Assertions.assertEquals(bookList, books);

    }

    @Test
    void testForGettingTotalNoOfBooks() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Head First java", " Kathy Sierra");
        Book book2 = new Book("Clean Code", "Robert.C.Martin");
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(bookList);
        int total = library.getTotalNoOfBooks();
        Assertions.assertEquals(2, total);
    }

    @Test
    void testToSetTheListOfBooks(){
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Head First java", " Kathy Sierra");
        Book book2 = new Book("Clean Code", "Robert.C.Martin");
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(bookList);
        library.setBooks(bookList);
        Assertions.assertSame(library.getTotalBooksInLibrary(),bookList);

    }
}