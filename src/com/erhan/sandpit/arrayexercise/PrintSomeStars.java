package com.erhan.sandpit.arrayexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSomeStars {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter numbers: ");

        while (true) {

            num = sc.nextInt();

            if (num == -1) {
                break;
            }

            numbers.add(num);
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i ++) {

            for (int j = 1; j <= numbers.get(i); j++  ) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


}
