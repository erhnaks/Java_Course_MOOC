package com.erhan.sandpit;

import java.util.Scanner;

public class WhileTrueWithCondition {
    public static void main (String[] args) {
        int num;
        int counter = 0 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Countdown: ");

        num = scan.nextInt();
        System.out.println();

    while (counter <= num) {

        System.out.println( num);
        num--;
    }
        System.out.println("GO! GO! GO!");
    }
}
