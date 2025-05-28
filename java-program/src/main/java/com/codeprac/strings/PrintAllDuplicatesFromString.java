package com.codeprac.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicatesFromString {
    public static void main(String[] args) {
        String input = "aaabbbbcccccddddeeeffffg";
        char[] ch = input.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
