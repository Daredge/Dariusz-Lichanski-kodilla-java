package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
