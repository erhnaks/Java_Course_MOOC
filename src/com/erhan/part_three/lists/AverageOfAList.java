package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        double avr = 1.0;
        int sum = 0;

        System.out.println("Numbers entered: ");

        for (Integer nums : list) {
            System.out.println(nums);
        }
        System.out.println();
        System.out.println("Average of the numbers are: ");
        for (Integer i : list) {
            sum += i;
            avr = 1.0 * sum / list.size();
        }
        System.out.println("Average: " + avr);

    }
}

/*The exercise template contains a base that reads numbers from the user and adds them to a list.
Reading is stopped once the user enters the number -1.

When reading ends, calculate the average of the numbers in it, and then print that value.*/