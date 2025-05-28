package com.codeprac.strings;

public class CountNoOfVowelsConsonants {
    public static void main(String[] args) {
        String str = "DeepSPanchal";
        char[] ch = str.toLowerCase().toCharArray();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowels++;
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                consonants++;
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
    }
}
