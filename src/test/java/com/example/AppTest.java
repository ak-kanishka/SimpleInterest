package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSimpleInterest() {

        double result =
                App.calculateSimpleInterest(10000, 5, 2);

        assertEquals(1000.0, result, 0.001);
    }

    @Test
    public void testAnotherSimpleInterest() {

        double result =
                App.calculateSimpleInterest(5000, 10, 3);

        assertEquals(1500.0, result, 0.001);
    }
}