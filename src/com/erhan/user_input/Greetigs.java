package com.erhan.user_input;

import java.util.Scanner;

public class Greetigs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }
}
