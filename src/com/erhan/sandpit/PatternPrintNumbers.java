package com.erhan.sandpit;

import java.util.Scanner;

public class PatternPrintNumbers {
    public static void main(String[] args) {
        int num = numberOfTimes(5);

      for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {
              System.out.print(j);
          }
          System.out.println();
      }
    }

    public static int numberOfTimes(int num) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scan.nextInt();

        return num;
    }
}