package com.codeprac.strings;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfCharInAString {
    public static void main(String[] args) {
        String str = "aaabbbcdddeeeeeffff";
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for (Character c : chars) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue() == 1){
                System.out.println("Non repeating character is : " + entry.getKey() + " ");
            }
        }
    }
}
