package com.erhan.part_four.file_input_output.read_a_file;

import java.nio.file.Path;
import java.util.Scanner;

public class ReadTheDataFile {
    public static void main (String[] args) {

        try (Scanner sc = new Scanner(Path.of("recordsfromafile.txt"))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error is : " + e );
        }

    }
}
