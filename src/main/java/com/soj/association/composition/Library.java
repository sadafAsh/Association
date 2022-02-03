package com.soj.association.composition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Library {
    static final Logger logger= LogManager.getLogger(Library.class.getName());

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }


    public List<Book> getTotalBooksInLibrary() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getTotalNoOfBooks(){
        int noOfBooks=0;
        for(Book book:books){
            book.getTitle();
        noOfBooks++;
        }
        return noOfBooks;

    }

}
