package com.codeprac.strings;

public class StringToUpperCase {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            sb.append((char) (ch - 32));
        }
        System.out.println(sb);
    }
}
