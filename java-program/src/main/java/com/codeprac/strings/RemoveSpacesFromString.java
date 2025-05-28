package com.codeprac.strings;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "This is a test";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            char charLowerCase = Character.toLowerCase(c);
            if (charLowerCase != ' '){
                sb.append(charLowerCase);
            }
        }
        System.out.println(sb);
    }
}
