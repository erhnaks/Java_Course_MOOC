package com.erhan.part_four.oop.whistle;

public class Main {
    public static void main (String[] args) {
        Whistle dog = new Whistle("Woof!");
        Whistle dogOne = new Whistle("Hav Hav!");

        dog.sound();
        dogOne.sound();
        dog.sound();
    }
}
