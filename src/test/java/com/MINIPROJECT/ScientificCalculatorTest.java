package com.MINIPROJECT;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ScientificCalculatorTest {

    @Test
    void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0)); // 0! = 1
        assertEquals(1, ScientificCalculator.factorial(1)); // 1! = 1
        assertEquals(2, ScientificCalculator.factorial(2)); // 2! = 2
        assertEquals(6, ScientificCalculator.factorial(3)); // 3! = 6
        assertEquals(120, ScientificCalculator.factorial(5)); // 5! = 120
    }

    @Test
    void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.factorial(-1);
        });
        assertEquals("Factorial is not defined for negative numbers.", exception.getMessage());
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, Math.sqrt(9), 0.0001);
        assertEquals(5.0, Math.sqrt(25), 0.0001);
        assertEquals(0.0, Math.sqrt(0), 0.0001);
    }

    @Test
    void testNaturalLogarithm() {
        assertEquals(0, Math.log(1), 0.0001); // ln(1) = 0
        assertEquals(Math.log(10), Math.log(10), 0.0001);
    }

    @Test
    void testPowerFunction() {
        assertEquals(8.0, Math.pow(2, 3), 0.0001);
        assertEquals(1.0, Math.pow(5, 0), 0.0001); // Any number to the power of 0 is 1
        assertEquals(25.0, Math.pow(5, 2), 0.0001);
    }
}
