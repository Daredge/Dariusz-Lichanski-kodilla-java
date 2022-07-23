package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Test collection")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when list of numbers is empty, list of even numbers should be empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> emptyOddNumbers = oddNumberExterminator.exterminate(numbers);
        List<Integer> expectedEmptyList = new ArrayList<>();
        //Then
        Assertions.assertEquals(expectedEmptyList, emptyOddNumbers);
    }

    @DisplayName("when list of numbers contains numbers, list of even numbers should contains even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        //When
        List<Integer> evenNumbers = oddNumberExterminator.exterminate(numbers);
        List<Integer> expectedEvenNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i += 2) {
            expectedEvenNumbers.add(i);
        }
        //Then
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }

    @DisplayName("additional test Arrays.asList()")
    @Test
    void additionalTest() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        Integer[] numbersInArray = new Integer[50];
        for (int i = 0; i < 50; i++) {
            numbersInArray[i] = i;
        }
        List<Integer> numbers = Arrays.asList(numbersInArray);
        //When
        List<Integer> evenNumbers = oddNumberExterminator.exterminate(numbers);
        List<Integer> expectedEvenNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i += 2) {
            expectedEvenNumbers.add(i);
        }
        //Then
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }
}
