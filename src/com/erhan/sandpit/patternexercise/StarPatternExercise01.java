package com.erhan.sandpit.patternexercise;

public class StarPatternExercise01 {
    public static void main(String[] args) {
        int numberOfRows = 6;

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
