package com.erhan.part_four.file_input_output.records_from_a_file;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

// fileName for this exercise is : recordsfromafile
        try(Scanner scan = new Scanner(Paths.get(fileName)) ) {
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                if (str.isEmpty()) {
                    continue;
                }
                String [] parts = str.split(",");

                String name = parts[0];

                int age = Integer.parseInt(parts[1]);
                System.out.println(name + ", age: " + age + " years");
            }




        } catch (Exception err) {
            System.out.println("Error :" + err);
        }


    }
}
