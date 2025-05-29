package com.codeprac.strings;

//sliding window program
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabccabba";
        int left = 0;
        int right = 0;
        int maxLength = 0;

        Set<Character> seen = new HashSet<>();

        while (right < str.length()) {
            if (!seen.contains(str.charAt(right))){
                seen.add(str.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            } else {
                seen.remove(str.charAt(left));
                left++;
            }
        }

        System.out.println("Longest Substring without repeating character is : " + maxLength);
    }
}
