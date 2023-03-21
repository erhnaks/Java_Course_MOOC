package com.erhan.variables_in_java;

import java.util.Scanner;

public class StringsToDouble {
    // write your program here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your program here
        System.out.println("Give me a number:");

        double number = Double.parseDouble(scanner.nextLine());
        System.out.println("You gave the number " + number);


    }
}
