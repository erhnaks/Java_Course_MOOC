package com.erhan.numbers;

import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = scanner.nextInt();

        System.out.println("Give the second number:");
        int second = scanner.nextInt();

        int sum = first * second;

        System.out.println(first + " * " + second + " = " + sum);

    }
}
