package com.erhan.sandpit;

import java.util.ArrayList;

public class ArrayListIndexPrinting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(5);
        list.add(33);
        list.add(42);
        list.add(1);

        System.out.println(list.size());

        System.out.println(list.get(2));

    }
}
