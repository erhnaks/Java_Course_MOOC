package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThirdInArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
