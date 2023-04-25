package com.erhan.sandpit.java_testing.calculator_junit_testing;

public class MainProgram {
    public static void main (String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(6);

        System.out.println(calculator.getValue());

        System.out.println("-----------------------------");

        calculator.subtract(7);

        System.out.println(calculator.getValue());

    }
}
