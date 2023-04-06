package com.erhan.part_four.objects_in_a_list.tv_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");

            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            TelevisionProgram show = new TelevisionProgram(name, duration);

            programs.add(show);

        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram shows : programs) {
            if (shows.getDuration() <= maxDuration) {
                System.out.println(shows.getName() + ", " + shows.getDuration() + " minutes");
            }
        }

    }
}
