package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        // first test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // second test
        Calculator calculator = new Calculator();

        if (calculator.add(5, 6) == 11) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        // third test
        if (calculator.subtract(5, 6) == -1) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
