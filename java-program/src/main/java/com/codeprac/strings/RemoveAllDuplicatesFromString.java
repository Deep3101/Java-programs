package com.codeprac.strings;

import java.util.HashMap;

public class RemoveAllDuplicatesFromString {
    public static void main(String[] args) {
        String input = "aaabbbbcccccddddeeeffffg";
        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
//                map.put(ch, map.getOrDefault(ch, 0) + 1);
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
