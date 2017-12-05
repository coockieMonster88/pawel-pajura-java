package com.kodilla;


import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;

class QueueExample {

    public static void main(String[] args) {
        ArrayDeque<String> theQueue = new ArrayDeque<>();
        Random random = new Random();
        for (int n = 0; n < 50; n++) {
            String s = "";
            int len = random.nextInt(50) + 1;
            for (int k = 0; k < len; k++) {
                s = s + "a";
            }
            theQueue.offer(s);
        }
        System.out.println("Initial Queue: " + theQueue.size());

        EvenSeparator evenSeparator = new EvenSeparator();
        List<String> theList = evenSeparator.separate(theQueue);
        for (int n = 0; n < theList.size(); n++) {
            System.out.println(theList.get(n));
        }
    }
}