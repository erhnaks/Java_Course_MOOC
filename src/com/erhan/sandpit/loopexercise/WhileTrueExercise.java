package com.erhan.sandpit.loopexercise;

import java.util.Scanner;

public class WhileTrueExercise {
    public static void main (String [] args){
        int num = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        System.out.println("------------------------------------------");

        while(true){
            System.out.println(num);
          if (num >= input){
              break;
          }
            num = num + 1;
        }

        System.out.println("------------------------------------------");
        System.out.println("Ready!");
    }
}
