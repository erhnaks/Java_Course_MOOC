package com.erhan.part_two.repeating_functionality;

import java.util.Scanner;

public class WhileTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String str = scanner.nextLine();
            if (str.equals("no")) {
                break;
            }
        }
    }
}
