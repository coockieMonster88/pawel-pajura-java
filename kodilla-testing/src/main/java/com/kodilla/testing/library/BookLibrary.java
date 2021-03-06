package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);


        return bookList;
    }
    public List<Book> listBooksInHandsOf (LibraryUser libraryUser) {
        List<LibraryUser> libraryUsers = new ArrayList<>();
        libraryUsers.add(libraryUser);
        return  libraryDatabase.listBooksInHandsOf(libraryUsers);
    }
}
