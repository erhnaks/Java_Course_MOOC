package com.erhan.part_three.lists;

import java.util.ArrayList;
import java.util.List;

public class TotalInTheList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(List<Integer> numbers) {

        int total = 0;

        for (int nums : numbers) {
            total += nums;
        }
        return total;
    }

}
