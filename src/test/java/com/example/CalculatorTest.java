package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

    @Test
    @DisplayName("2 - 1 = 1")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1), "2 - 1 should equal 1");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "51,  49,    2",
            "100, 10,   90"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.subtract(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}