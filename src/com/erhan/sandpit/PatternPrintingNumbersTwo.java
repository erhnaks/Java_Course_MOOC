package com.erhan.sandpit;

import java.util.Scanner;

public class PatternPrintingNumbersTwo {
    public static void main(String[] args) {
        printPattern(4);
    }

    public static void printPattern(int number) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        System.out.println("OZAN");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
