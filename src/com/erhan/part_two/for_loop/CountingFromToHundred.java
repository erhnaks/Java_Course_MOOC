package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class CountingFromToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = num; i <= 100; i++ ) {
            System.out.println(i);
        }
    }
}
