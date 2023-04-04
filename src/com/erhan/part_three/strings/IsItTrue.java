package com.erhan.part_three.strings;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Is it true? ");
        String str = scan.nextLine();

        if (str.equals("true"))
            System.out.println("You got that right!");
        else
            System.out.println("Try again!");
    }
}
