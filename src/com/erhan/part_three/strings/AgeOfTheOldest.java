package com.erhan.part_three.strings;

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int maxAge = 0;
        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] coma = str.split(",");

            age = Integer.valueOf(coma[1]);
/*
            if (age > maxAge) {
                maxAge = age;
            }

                }
        System.out.println("Age of the oldest: " + maxAge);*/
            if (age > maxAge) {
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }

}
