package com.erhan.part_two.repeating_functionality;

import java.util.Scanner;

public class NumberOfNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNegativeNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0 ) {
                break;
            } else if (num < 0) {
                numberOfNegativeNumbers = numberOfNegativeNumbers + 1;
            }
        }
        System.out.println("Number of negative numbers: " + numberOfNegativeNumbers);
    }
}
