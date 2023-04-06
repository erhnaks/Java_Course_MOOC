package com.erhan.part_four.objects_in_a_list.books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");

            String title = sc.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = sc.nextInt();

            System.out.print("Publication year: ");
            int publicationYear = sc.nextInt();
            sc.nextLine();

            Book book = new Book(title, pages, publicationYear);

            books.add(book);

        }

        System.out.print("What information will be printed? ");
        String printDetails = sc.nextLine();

        for (Book book : books) {


            if (printDetails.equals("everything")) {
                System.out.println(book.getTitle() + ", " + book.getPage() + " pages, " + book.getYearOfPublication());
            } else if (printDetails.contains("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book.getTitle() + " " + book.getPage());
            }

        }

    }
}
