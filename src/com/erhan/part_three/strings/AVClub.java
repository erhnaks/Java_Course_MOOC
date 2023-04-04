package com.erhan.part_three.strings;

import java.util.Scanner;

public class AVClub {

import java.util.Scanner;

    public class AVClub {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {

                String str = scanner.nextLine();
                if (str.equals("")) {
                    break;
                }

                String[] space = str.split(" ");

                for (String s : space) {
                    if (s.contains("av"))
                        System.out.println(s);
                }

            }
        }
    }
}
