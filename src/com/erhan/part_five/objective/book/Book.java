package com.erhan.part_five.objective.book;

public class Book {
    private String author;
    private String name;
    private int page;


    public Book(String author, String name, int page) {
        this.author = author;
        this.name = name;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPage() + " pages.";
    }
}
