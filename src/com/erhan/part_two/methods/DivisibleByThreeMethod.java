package com.erhan.part_two.methods;

import java.util.Scanner;

public class DivisibleByThreeMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = scanner.nextInt();

        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println();

        divisibleByThreeInRange(num1, num2);

        System.out.println("-------------------------");
        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
