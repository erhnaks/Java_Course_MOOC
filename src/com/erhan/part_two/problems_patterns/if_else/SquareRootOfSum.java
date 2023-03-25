package com.erhan.part_two.problems_patterns.if_else;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        System.out.println(Math.sqrt(numOne + numTwo));
    }
}
