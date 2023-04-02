package com.erhan.sandpit;

import java.util.Scanner;

public class TrianglePatternPrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to start drawing your Triangle: ");
        int triangle = sc.nextInt();

        for (int i = 1; i <= triangle; i++) {
            for (int s = 1; s <= triangle - i; s++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
