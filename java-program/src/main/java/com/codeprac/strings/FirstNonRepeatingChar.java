package com.codeprac.strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "deepd";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            boolean  isRepeated = false;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j] && i!=j) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println(ch[i]);
            }
        }

    }
}
