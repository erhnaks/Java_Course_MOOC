package com.erhan.part_three.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int result = 0;
//        for (int i = 0; i < array.length; i++) {
//            result += array[i];
//        }
//        return result;

        for (Integer i : array) {
            result += i;
        }
        return  result;
    }
}
