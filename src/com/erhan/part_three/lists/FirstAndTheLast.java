package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndTheLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                int index = list.size() - 1;
                for (int i = index; i <= index; i++) {
                    System.out.println(list.get(0));
                    System.out.println(list.get(i));
                }
                break;
            }

            list.add(input);
        }

    }
}
