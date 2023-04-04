package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IsItOnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");

        String str = scanner.next();

        if (list.contains(str)) {
            System.out.println(str + " was found!");
        } else {
            System.out.println(str + " was not found!");
        }
    }
}
