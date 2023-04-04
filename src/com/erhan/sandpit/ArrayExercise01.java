package com.erhan.sandpit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExercise01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Please enter your words to be stored: ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
        list.add(input);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
