package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class SumOfSequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = scanner.nextInt();

        System.out.print("Last number? ");
        int last = scanner.nextInt();

        int result = 0;

        for (int i = first; i <= last; i++) {
            result += i;
            System.out.print(" + " + i);
        }
        System.out.println("The sum is: " + result);
    }
}
/*Implement a program which calculates the sum of a closed interval, and prints it.
Expect the user to write the smaller number first and then the larger number.

You can base your solution to this exercise to the solution of last exercise —
add the functionality for the user to enter the starting point as well.*/