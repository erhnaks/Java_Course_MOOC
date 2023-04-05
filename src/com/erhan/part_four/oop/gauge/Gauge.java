package com.erhan.part_four.oop.gauge;

public class Gauge {

    private int value;

    public Gauge() {
        value = 0;
    }

    public void increase() {
        if (value < 5) {
            value += 1;
        }
    }

    public void decrease() {
        if (value != 0) {
            value -= 1;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return value == 5;
    }

}
