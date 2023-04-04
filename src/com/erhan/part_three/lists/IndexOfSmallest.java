package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age group: ");
        System.out.println("Enter 999 to save and exit");
        System.out.println();

        ArrayList<Integer> age = new ArrayList<>();

        while (true) {
            int input = scan.nextInt();
            if (input == 999) {
                break;
            }
            age.add(input);
        }

        int smallest = age.get(0);

        for (int i = 0; i < age.size(); i++) {
            int num = age.get(i);

            if (num < smallest) {
                smallest = num;
            }

        }
        System.out.println(smallest);

        for (int i = 0; i < age.size(); i++) {
            int num = age.get(i);
            if (smallest == num) {
                System.out.println("Found at index " + i);
            }
        }


     /*   for (int ages : age) {
            System.out.println(ages);
        }*/

    }
}
