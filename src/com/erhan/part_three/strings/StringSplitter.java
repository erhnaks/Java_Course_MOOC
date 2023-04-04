package com.erhan.part_three.strings;

import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "String";
        while (true) {

            if (str.equals("")) {
                break;
            }
            str = scanner.nextLine();

            String[] space = str.split(" ");

            for (String s : space) {
                System.out.println(s);
            }
        }


    }
}
