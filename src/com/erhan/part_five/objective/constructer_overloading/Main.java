package com.erhan.part_five.objective.constructer_overloading;

public class Main {
    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

    }
}
