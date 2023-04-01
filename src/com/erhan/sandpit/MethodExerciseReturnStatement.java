package com.erhan.sandpit;

public class MethodExerciseReturnStatement {

    public static int isItLessThanTen(int num) {
        if (num > 10) {
            return num;
        }
        System.out.println("The parameter entered is less than 10");
        return 10;
    }


    public static void main (String[] args) {

        System.out.println(isItLessThanTen(4));

    }
}
