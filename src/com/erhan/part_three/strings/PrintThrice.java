package com.erhan.part_three.strings;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");

        String str = scanner.nextLine();

        reader(str);


    }

    public static void reader(String name) {
        for( int i = 0; i < 3; i++) {
            System.out.print(name);
        }
    }
}
