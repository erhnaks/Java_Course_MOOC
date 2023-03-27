package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class WhereFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int end = scanner.nextInt();
        System.out.print("Where from?");
        int from = scanner.nextInt();

        for (int i = from; i <= end; i++) {
            System.out.println(i);
        }
    }
}
