package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");

        int num = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *=  i;
        }
        System.out.println("Factorial: " + result);
    }
}
/*Implement a program which calculates the factorial of a number given by the user.

Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example,
the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
And now the internal calculation was 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800

Additional info: Factorials are used especially in probability calculus when examining different
possible orders of a set. For example, a group of five people can form 5! different lines,
and a pack of 52 cards can be in 52! different orders. Factorial can also be used to calculate combinations;
For example it is possible to deal 52! / (5! * (52-5)!) different hands from a 52 card pack,
and you can form 40! / (7! * (40 - 7)!) different 7 number lottery lines from 40 numbers.
*/

