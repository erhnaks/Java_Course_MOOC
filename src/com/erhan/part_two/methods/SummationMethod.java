package com.erhan.part_two.methods;

public class SummationMethod {

    public static int sumItUp(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {

        int result = sumItUp(3, 4, 5, 7);

        System.out.println(result);
        System.out.println("-------------------");
        System.out.println("The total of :" + sumItUp(4, 8, 343, 66));

    }
}
