package com.erhan.part_two.methods;

public class DivisionMethod {
    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. For example division(3,5);
        // should print "0.6"

        // division(3, 5);
        division(3, 5);

        System.out.println("---------------------------------");

        int num1 = 20;
        int num2 = 5;

        division(num1, num2);


    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        double result = (double) numerator / denominator;
        System.out.println(result);
    }

}

/*Write a method public static void division(int numerator, int denominator) that prints the result of the division of the numerator by the denominator.
Keep in mind that the result of the division of the integers is an integer — in this case we want the result to be a floating point number.*/
