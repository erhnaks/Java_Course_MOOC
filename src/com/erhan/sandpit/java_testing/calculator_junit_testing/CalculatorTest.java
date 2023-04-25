package com.erhan.sandpit.java_testing.calculator_junit_testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueIsZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void calculatorAddTest() {
        Calculator calculator = new Calculator();
        calculator.add(4);
        assertEquals(4, calculator.getValue());
    }

    @Test
    public void calculatorSubTest() {
        Calculator calculator = new Calculator();
        calculator.subtract(3);
        assertEquals(-3, calculator.getValue());
    }

}
