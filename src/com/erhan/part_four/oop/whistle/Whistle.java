package com.erhan.part_four.oop.whistle;

public class Whistle {
    private String sound;

    public Whistle (String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println("The dog said : " + sound);
    }


}
