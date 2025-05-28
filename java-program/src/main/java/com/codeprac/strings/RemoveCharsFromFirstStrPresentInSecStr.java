package com.codeprac.strings;

import java.util.HashMap;

public class RemoveCharsFromFirstStrPresentInSecStr {
    public static void main(String[] args) {
        String str1 = "abcdefghijkolopm";
        String str2 = "abcdefghijk";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : chars2){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : chars1){
            if (!map.containsKey(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
}
