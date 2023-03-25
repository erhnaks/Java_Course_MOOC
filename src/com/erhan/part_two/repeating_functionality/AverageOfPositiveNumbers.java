package com.erhan.part_two.repeating_functionality;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    /*
    Write a program that asks the user for input until the user inputs 0. After this,
    the program prints the average of the positive numbers (numbers that are greater than zero).

    If no positive number is inputted, the program prints "Cannot calculate the average"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                count++;
                sum = sum + num;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double) sum / count));
        }
    }
}
