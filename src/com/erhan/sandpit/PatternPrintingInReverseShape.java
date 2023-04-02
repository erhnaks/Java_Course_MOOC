package com.erhan.sandpit;

public class PatternPrintingInReverseShape {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++) {

            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
