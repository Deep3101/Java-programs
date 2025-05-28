package com.codeprac.strings;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str = "123xyz";
        int sum = 0;
        String[] numbers = str.split("[^0-9]+");

        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
