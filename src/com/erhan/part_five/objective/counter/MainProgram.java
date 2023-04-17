package com.erhan.part_five.objective.counter;

public class MainProgram {


        public static void main(String[] args) {
            // Test your counter here

            Counter counter = new Counter();
            Counter startCounter = new Counter(140);

            counter.increase();
            counter.increase();
            System.out.println(counter.value());
            counter.increase();
            System.out.println("new value of " +counter.value());

            System.out.println("-----------------");

            System.out.println("Value at the start:" + startCounter.value());

            startCounter.increase(10);
            startCounter.increase(10);
            startCounter.increase(10);

            System.out.println("New value after the start:" + startCounter.value());

            System.out.println("----------------------");

            startCounter.decrease(-4);

            System.out.println("New value after the decrease by negative:" + startCounter.value());




        }
    }


