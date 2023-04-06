package com.erhan.part_four.file_input_output;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int count = 0;
        int wins = 0;
        int loss = 0;
// fileName : data.csv
        try (Scanner file = new Scanner(Paths.get(fileName))) {

            while (file.hasNextLine()) {
                String str = file.nextLine();
                if (str.isEmpty()) {
                    continue;
                }

                String[] parts = str.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.parseInt(parts[2]);
                int awayScore = Integer.parseInt(parts[3]);

                if (homeTeam.equals(teamName) || awayTeam.equals(teamName)) {
                    count++;
                    if (homeTeam.equals(teamName) && homeScore > awayScore || awayTeam.equals(teamName) && awayScore > homeScore) {
                        wins++;
                    } else {
                        loss++;
                    }
                }
            }
        } catch (Exception err) {
            System.out.println("Error : " + err);
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);

    }
}
