package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        //creating lists of books
        Library library = new Library("library");
        library.getBooks().add(new Book("Witcher","sapkowski", LocalDate.of(1995, 02, 15)));
        library.getBooks().add(new Book("Władca Pierścieni", "JRR Tolkien", LocalDate.of(1975, 10, 21)));
        library.getBooks().add(new Book("Bournes Ultimate", "Robert Ludlum", LocalDate.of(1991, 12, 12)));
        //When
        Library shallowLibrary = library.shallowCopy();
        Library deepLibrary = library.deepCopy();
        ///Then
        library.getBooks().remove(new Book("Witcher","sapkowski", LocalDate.of(1995, 02, 15)));
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowLibrary.getBooks().size());
        Assert.assertEquals(3,deepLibrary.getBooks().size());
    }
}
