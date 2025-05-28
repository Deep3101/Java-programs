package com.codeprac.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);

            if (i != 0){
                reversedWords.append(" ");
            }
        }
        System.out.println(reversedWords);

    }
}
