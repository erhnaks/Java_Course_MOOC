package com.erhan.part_two.methods;

import java.util.Scanner;

public class MethodCalling {
    public static void main (String[ ] args) {
        String name= "";
        greet(name);
    }

    public static void greet(String name) {
        System.out.println("Hi, My name is Java. What is your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Hello, " + name + "! Nice to meet you!");
    }
}
