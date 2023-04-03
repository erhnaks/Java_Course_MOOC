package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyPrintFromToNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {

                System.out.print("From where? ");
                int from = scanner.nextInt();
                System.out.print("To where? ");
                int to = scanner.nextInt();

                for (int i = from; i <= to; i++) {
                    System.out.println(numbers.get(i));
                }
                break;
            }
            numbers.add(number);
        }
    }
}
