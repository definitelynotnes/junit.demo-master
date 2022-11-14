package com.bootcamp.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator target;

    @Before
    public void setup() {
        target = new Calculator();
    }

    @Test
    public void shouldReturnSumOfTwoIntegerNumbers() {
        int actualResult = target.computeSum(10, 5);
        assertEquals(15, actualResult);
    }

    @Test
    public void shouldReturnSumOfTwoNumbersAsString() {
        int actualResult = target.computeSum(5, 1);
        assertEquals(6, actualResult);

        actualResult = target.computeSum("-10", "-5");
        assertEquals(-15, actualResult);
    }

    @Test(expected = NumberFormatException.class)
    public void shouldThrowNumberFormatExceptionWhenAddingNonNumericValues() {
        target.computeSum("a", "10");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }
}
