package com.erhan.sandpit;
import java.util.Scanner;
public class PerfectNumber {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0 ) {
                sum += i;
            }
        }
        if (sum == num)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
