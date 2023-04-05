package com.erhan.part_four.oop.product;

public class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.price = cost;
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }


}
