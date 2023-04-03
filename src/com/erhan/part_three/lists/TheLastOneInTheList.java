package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TheLastOneInTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                int i = list.size() - 1;
                System.out.println(list.get(i));
                break;
            }
            list.add(input);
        }
    }
}
