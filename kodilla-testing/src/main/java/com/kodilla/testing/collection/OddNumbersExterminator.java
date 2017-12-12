package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {


    public OddNumbersExterminator() {

    }

    public List exterminate(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
