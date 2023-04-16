package com.erhan.sandpit.arrayexercise;

import java.util.ArrayList;
import java.util.Scanner;

public class SomeStringArrays {
    public static void main (String[] args) {

        ArrayList<String> name = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the list of names: ");

        while(true) {
            String names = scan.nextLine();

            if (names.equals("")) {
                break;
            }
            name.add(names);
        }

       for (int i = 0; i < name.size(); i++) {
           System.out.println(name.get(i));
       }
    }
}
