package com.erhan.part_one.conditionals;

import java.util.Scanner;

public class StringComparision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scan.nextLine();

//        if(firstString.equalsIgnoreCase()) This line will compare strings with ignoring lower or upper case letters!

        if (firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
