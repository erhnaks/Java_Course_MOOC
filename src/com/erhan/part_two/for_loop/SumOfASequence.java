package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number?");
        int lastNumber = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= lastNumber; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
