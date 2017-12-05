package com.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class EvenSeparator {

    public List <String> separate (Queue <String> theQueue ) {
        List <String> resultList = new ArrayList<>();
        while (theQueue.size() > 0) {
            String s = theQueue.poll();
            if (s.length() % 2 == 0) {
                resultList.add(s);
            }
        }

        return resultList;
    }

}
