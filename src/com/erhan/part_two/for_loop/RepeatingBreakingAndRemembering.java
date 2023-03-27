package com.erhan.part_two.for_loop;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (true) {

            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += number;
            numberOfNumbers++;
            average = (double) sum / numberOfNumbers;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
/*Next, we'll implement a program one piece at a time. This is always strongly recommended when coding.

The series of exercises form a larger program whose functionality is implemented in small pieces.
If you do not finish the whole series, you can still submit the parts you've completed to be checked.
This can be done by clicking the "submit" button (the arrow pointing up) to the right of the "test" button.
Although the submission system complains about the tests of unfinished parts, you get points for the parts you have finished.

NB: Remember that each sub-part of the series is equivalent to one individual exercise.
As such, the series is equivalent to five individual exercises.

Note: the tests might fail a correct solution. This is a known bug that will be fixed in the future.
In the meantime, you can avoid the error by printing "Give numbers:" without any spaces after ':'

Reading
Implement a program that asks the user for numbers (the program first prints
"Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
PART 2- Sum of numbers
Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

PART 3- Sum and the number of numbers
Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
PART - 4 Average of numbers
Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
PART -5 Even and odd numbers
Extend the program so that it prints the number of even and odd numbers (excluding the -1).*/