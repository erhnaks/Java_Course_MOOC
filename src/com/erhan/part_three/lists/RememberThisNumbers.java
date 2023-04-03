package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberThisNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int luku = scanner.nextInt();
            if (luku == -1) {

                break;
            }
            numbers.add(luku);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
