package com.kodilla.patterns.prototype.library;

import java.util.ArrayList;
import java.util.List;

public final class BooksList {
    final String name;
    final List <Book> booksList = new ArrayList<>();

    public BooksList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    @Override
    public String toString() {
        return "BooksList{" +
                "name='" + name + '\'' +
                ", booksList=" + booksList +
                '}';
    }
}
