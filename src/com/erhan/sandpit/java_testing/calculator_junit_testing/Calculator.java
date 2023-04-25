package com.erhan.sandpit.java_testing.calculator_junit_testing;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int num) {
        this.value += num;
    }

    public void subtract(int num) {
        this.value -= num;
    }

    public int getValue() {
        return this.value;
    }
}
