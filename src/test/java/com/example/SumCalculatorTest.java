package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testSumWithParameterOne() {
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumWithParameterThree() {
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumWithParameterNullAndThrowsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }

}
