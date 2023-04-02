package com.erhan.sandpit;

import java.util.Scanner;

public class PatternPrintNumbers {
    public static void main(String[] args) {
//        int num = numberOfTimes(5);

        printPattern(3);
        printPatternRepeated(3);


    }

    public static void printPattern(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPatternRepeated(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

/*    public static int numberOfTimes(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        return num;
    }*/


}