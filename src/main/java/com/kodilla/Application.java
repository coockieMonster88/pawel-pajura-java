package com.kodilla;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        List<Book> library = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            library.add(new Book("Title number" + i, "Author number" + i));
        }
        Book theBookBegin = new Book("Wiedzmin", "A. Sapkowski");
        long begin = System.nanoTime();
        library.add(0, theBookBegin);
        long end = System.nanoTime();
        System.out.println("Add book at index 0: " + (end - begin));

        Book theBookEnd = new Book("Duch ognia", "G. Masterton");
        begin = System.nanoTime();
        library.add(theBookEnd);
        end = System.nanoTime();
        System.out.println("Add book at index " + library.size() + ": " + (end - begin));

        begin = System.nanoTime();
        library.remove(theBookEnd);
        end = System.nanoTime();
        System.out.println("Remove book at index " + (library.size() +1) + ": " + (end - begin));

        begin = System.nanoTime();
        library.remove(theBookBegin);
        end = System.nanoTime();
        System.out.println("Remove book at index 0: " + (end - begin));

        Map<Book,String> theMap = new HashMap<>();
        for (int i = 0; i < 30000; i++) {
            theMap.put(new Book("Title number" + i, "Author number" + i), "text number" + i);
        }

        begin = System.nanoTime();
        theMap.remove(new Book("Title number" + 0, "Author number" + 0));
        end = System.nanoTime();
        System.out.println("Remove entry at begin: " + (end - begin));

        begin = System.nanoTime();
        theMap.remove(new Book("Title number" + 29999, "Author number" + 29999));
        end = System.nanoTime();
        System.out.println("Remove entry at end: " + (end - begin));
    }
}
