package com.codeprac.strings;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String str = "Hello, I am deep";
        str = str.replace(",","");
        str = str.replace(" ","");
        System.out.println(str);

        char[] s = str.toCharArray();
        System.out.println(s.length);

        char[] chars = str.toCharArray();
//        System.out.println(words.length);

//        System.out.println("The length of the words are : " + str.length());
        System.out.println("The length of the characters are : " + chars.length);


    }
}
