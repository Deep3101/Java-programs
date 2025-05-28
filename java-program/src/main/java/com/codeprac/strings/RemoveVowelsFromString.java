package com.codeprac.strings;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String str = "DeepSPanchal";
        StringBuilder builder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            char charLowerCase = Character.toLowerCase(ch);
            if (charLowerCase != 'a' && charLowerCase != 'e' && charLowerCase != 'i' && charLowerCase != 'o' && charLowerCase != 'u') {
                builder.append(charLowerCase);
            }
        }
        System.out.println(builder);

    }
}
