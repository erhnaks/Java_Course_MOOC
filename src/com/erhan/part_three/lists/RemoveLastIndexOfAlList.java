package com.erhan.part_three.lists;

import java.util.ArrayList;

public class RemoveLastIndexOfAlList {
    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> list) {
        int lastIndex = list.size() - 1;
        if (list.isEmpty()) {
            return;
        }
        list.remove(lastIndex);

    }
}
