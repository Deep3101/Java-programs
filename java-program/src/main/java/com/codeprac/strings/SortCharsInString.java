package com.codeprac.strings;

public class SortCharsInString {
    public static void main(String[] args) {
        String str = "afjjshsbjoormsp";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);
    }
}
