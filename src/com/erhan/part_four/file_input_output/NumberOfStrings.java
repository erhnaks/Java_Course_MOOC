package com.erhan.part_four.file_input_output;

import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int count = 0;

        while (true) {
            str = scanner.nextLine();

            if (str.contains("end")) {
                break;
            }
            count++;
        }

        System.out.println(count);

    }
}
