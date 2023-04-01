package com.erhan.part_two.methods;

public class GreatestNumber {
    public static void main(String[] args) {

        System.out.println("The greatest number is: " + greatest(11, 6, 29));

    }

    public static int greatest(int num1, int num2, int num3) {
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }
}
