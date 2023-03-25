package com.erhan.part_two.repeating_functionality;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sum = 0;


        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num != 0) {
                numberOfNumbers++;
                sum = sum + num;
            }
        }
        double average = Double.parseDouble(String.valueOf(sum)) / numberOfNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
