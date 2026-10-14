
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    // Test Case 1: Normal valid input
    @Test
    public void testSimpleInterest() {
        assertEquals(
            1000.0,
            App.calculateSimpleInterest(10000, 5, 2),
            0.001
        );
    }

    // Test Case 2: Another valid input
    @Test
    public void testAnotherSimpleInterest() {
        assertEquals(
            1500.0,
            App.calculateSimpleInterest(5000, 10, 3),
            0.001
        );
    }

    // Test Case 3: Zero principal
    @Test
    public void testZeroPrincipal() {
        assertEquals(
            0.0,
            App.calculateSimpleInterest(0, 5, 2),
            0.001
        );
    }

    // Test Case 4: Zero rate
    @Test
    public void testZeroRate() {
        assertEquals(
            0.0,
            App.calculateSimpleInterest(10000, 0, 2),
            0.001
        );
    }

    // Test Case 5: WRONG expected value - intentionally fails
    @Test
    public void testWrongExpectedValue() {
        assertEquals(
            1000.0,
            App.calculateSimpleInterest(10000, 5, 2),
            0.001
        );
    }
}
