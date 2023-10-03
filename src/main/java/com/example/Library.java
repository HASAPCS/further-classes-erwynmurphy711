package com.example;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> booklist;

    public Library() {
        this.booklist = new ArrayList<Book>();
        // TODO: Initialize the list of books
    }
    public void addBook(Book book){
        booklist.add(book);
    }
    public void removeBook(Book book){
        booklist.remove(book);
    }
    public Book findBookByISBN(String ISBN){
        for(Book book: booklist){
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }
    // TODO: Implement methods to add a book, check out a book, return a book, and find a book by ISBN
}
