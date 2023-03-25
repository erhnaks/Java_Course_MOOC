package com.erhan.part_two.repeating_functionality;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num == 0 ) {
                break;
            } if ( num != 0) {
                sum = sum + num;
                numberOfNumbers++;
            }

        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
