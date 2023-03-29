package com.erhan.sandpit;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();

        System.out.println(reverseWord(name1));
    }

/*    static String reverseWord(String input) {
        String[] words = input.split(" ");
        String returnWords = "";

        for (int i = 0; i < words.length; i++) {
            String thisWord = "";
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                thisWord = thisWord + word.charAt(j);
            }
            returnWords = returnWords + " " + thisWord;
        }
        return returnWords;
    }*/

    static String reverseWord(String input) {
        String[] words = input.split(" ");
        StringBuilder returnWords = new StringBuilder();

        for (String s : words) {
            StringBuilder thisWord = new StringBuilder();

            for (int j = s.length() - 1; j >= 0; j--) {
                thisWord.append(s.charAt(j));
            }
            returnWords.append(" ").append(thisWord);
        }
        return returnWords.toString();
    }
}



