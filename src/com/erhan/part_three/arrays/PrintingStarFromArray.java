package com.erhan.part_three.arrays;

public class PrintingStarFromArray {
    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int k : array) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
