package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculation() {

        String result = Calculator.Run("10+5*4");

        assertEquals("30.0", result);

    }
}
