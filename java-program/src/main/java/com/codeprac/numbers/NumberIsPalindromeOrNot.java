package com.codeprac.numbers;

public class NumberIsPalindromeOrNot {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reverseNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }

        return original == reverseNumber;
    }

    public static void main(String[] args) {
        int num = 252;

        if (isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
