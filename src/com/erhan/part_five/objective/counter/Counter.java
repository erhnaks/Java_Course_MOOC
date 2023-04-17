package com.erhan.part_five.objective.counter;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        } else {
            this.value = this.value;
        }

    }

    public void decrease(int decreaseBy) {

        if (decreaseBy > 0) {
            this.value = this.value - decreaseBy;
        } else {
            this.value = this.value;
        }

    }

}
