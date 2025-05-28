package com.codeprac.strings;

public class LargestWordInAString {
    public static void main(String[] args) {
        String str = "Java is a Programming Language";
        String[] words = str.split(" ");
        String largestWord = " ";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}
