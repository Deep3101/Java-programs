package com.codeprac.strings;

public class StringIsPalindrome {

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString().equals(str);
    }

    public static void main(String[] args) {
        String inp = "abc";

        if (isPalindrome(inp)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
