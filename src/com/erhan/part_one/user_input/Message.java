package com.erhan.part_one.user_input;
import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your message? ");
        String message = scanner.nextLine();

        System.out.println(message);

    }
}
