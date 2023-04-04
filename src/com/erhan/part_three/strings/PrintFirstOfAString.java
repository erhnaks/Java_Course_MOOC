package com.erhan.part_three.strings;

import java.util.Scanner;

public class PrintFirstOfAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] coma = str.split(" ");

            System.out.println(coma[0]);

        }
    }
}
