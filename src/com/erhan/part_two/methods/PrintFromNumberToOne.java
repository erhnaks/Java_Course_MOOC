package com.erhan.part_two.methods;

public class PrintFromNumberToOne {

    public static void printFromNumberToOne(int number) {
//        for (int i = number; i >= 1; i--) {
//            System.out.println(i);
//        }

        int i = number;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }

    }

    public static void main(String[] args) {
        printFromNumberToOne(20);
    }
}
