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
    public ArrayList<Book> listBooksInHandsOf (LibraryUser libraryUser) {
        ArrayList<LibraryUser> users = new ArrayList<LibraryUser>();
        LibraryUser user = new LibraryUser("Jan","Kowalski", "11111111111");
        users.add(user);
        return (ArrayList<Book>) libraryDatabase.listBooksInHandsOf(users);
    }
}
