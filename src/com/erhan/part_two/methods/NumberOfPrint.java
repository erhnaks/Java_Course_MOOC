package com.erhan.part_two.methods;

public class NumberOfPrint {
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printUntilNumber(5);
    }
}
