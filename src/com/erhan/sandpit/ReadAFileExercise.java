package com.erhan.sandpit;

import java.nio.file.Path;
import java.util.Scanner;

public class ReadAFileExercise {

    public static void main (String[] args) {


        try(Scanner reader = new Scanner(Path.of("src/com/erhan/part_four/file_input_output/read_a_file/data.txt"))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }

        } catch (Exception error) {
            System.out.println("Error: " + error);
        }


    }
}
