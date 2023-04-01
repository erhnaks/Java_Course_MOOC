package com.erhan.part_two.methods;

// Please read the tasks below to understand this code blocks below;
public class AdvanceAstrologyMethod {
    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size - 1;

        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height - 1;

        for (int i=0; i<height; i++) {
            printSpaces(spaces);
            printStars((i * 2) + 1);
            spaces--;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
/*Printing stars and spaces
PART 1 -
Define a method called printSpaces(int number) that produces the number of spaces specified by number.
The method does not print the line break.

You will also have to either copy the printStars method from your previous exercise or reimplement
it in this exercise template.

PART 2 -
Printing a right-leaning triangle
Create a method called printTriangle(int size) that uses printSpaces and printStars
to print the correct triangle. So the method call printTriangle(4) should print the following:

PART 3-
Printing a Christmas tree
Define a method called christmasTree(int height) that prints the correct Christmas tree.
The Christmas tree consists of a triangle with the specified height as well as the base.
The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
The tree is to be constructed by using the methods printSpaces and printStars.

For example, the call christmasTree(4) should print the following:*/
