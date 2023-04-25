package com.erhan.sandpit.java_testing.calculator_junit_testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void calculatorInitialValueIsZero() {
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void calculatorAddTest() {
        calculator.add(4);
        assertEquals(4, calculator.getValue());
    }

    @Test
    public void calculatorSubTest() {
        calculator.subtract(3);
        assertEquals(-3, calculator.getValue());
    }

}
