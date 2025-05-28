package com.codeprac.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharInAString {
    public static void main(String[] args) {
        String str = "Deep Sandeep Panchal";
        char[] chars = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : chars){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println(maxChar + " " + maxCount);
    }
}
