package com.erhan.part_two.methods;

import java.util.Scanner;

public class ReprintMethod {

    public static void printText() {
        System.out.println("I am printing this because you have asked for it!");
    }
    public static void main(String[] args) {

        System.out.println("How many times?");

        Scanner scan = new Scanner(System.in);
        var numberOfTimes = scan.nextInt();

        for (int i = 0; i < numberOfTimes; i++) {
            printText();
        }
    }
}
