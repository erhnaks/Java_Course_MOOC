package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheGreatestNumberInTheList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int greatest = list.get(0);

        for (int num : list) {
            if (num > greatest) {
                greatest = num;
            }

        }

        /*     for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num > greatest) {
                greatest = num;
            }

        }*/

        System.out.println(greatest);

    }
}
