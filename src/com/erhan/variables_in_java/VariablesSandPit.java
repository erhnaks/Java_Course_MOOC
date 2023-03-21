package com.erhan.variables_in_java;

import java.util.Scanner;

public class VariablesSandPit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        int numInteger = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double numDouble = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean condition = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + numInteger);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + condition);

    }
}
