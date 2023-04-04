package com.erhan.part_three.strings;

import java.util.Scanner;

public class LastWordOfJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] coma = str.split(" ");

            int index = coma.length - 1;

            System.out.println(coma[index]);

        }
    }
}
