package com.codeprac.strings;

public class CapitalizeFirstAndLastCharOfString {
    public static void main(String[] args) {
        String str = "deep panchal how are you";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1){
                sb.append(Character.toUpperCase(word.charAt(0)));
            } else {
                char first = Character.toUpperCase(word.charAt(0));
                String middle = word.substring(1, word.length() - 1);
                char last = Character.toUpperCase(word.charAt(word.length() - 1));

                sb.append(first).append(middle).append(last);
            }
            sb.append(" ");
        }
        System.out.println(sb);

    }
}
