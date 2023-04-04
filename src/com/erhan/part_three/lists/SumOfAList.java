package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int total = 0;
        for (Integer nums : list) {
            total += nums;
        }
        System.out.println("Total: " + total);
    }
}
