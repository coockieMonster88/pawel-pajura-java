package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an exmaple text"));
        String s = "Word";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify((s1) -> System.out.println(s.toUpperCase()));
        poemBeautifier.beautify((s1) -> System.out.println(s.toLowerCase()));
        poemBeautifier.beautify((s1) -> System.out.println(s.substring(0,3)));
    }
}
