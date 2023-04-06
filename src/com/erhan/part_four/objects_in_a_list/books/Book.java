package com.erhan.part_four.objects_in_a_list.books;

public class Book {
    private String title;
    private int page;
    private int yearOfPublication;


    public Book(String title, int page, int yearOfPublication) {
        this.title = title;
        this.page = page;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.page;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", page=" + page + ", yearOfPublication=" + yearOfPublication + '}';
    }
}
