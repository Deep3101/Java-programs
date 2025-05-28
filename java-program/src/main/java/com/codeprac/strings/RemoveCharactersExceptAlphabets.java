package com.codeprac.strings;

public class RemoveCharactersExceptAlphabets {
    public static void main(String[] args) {
        String str = "This&is#a**test";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){
            if (c != '$' && c != '%' && c != '&' && c != '+' && c != '-' && c != '#' && c != '*'){
                sb.append(c);
            } else {
                sb.append(' ');
            }
        }
        System.out.println(sb);

    }
}
