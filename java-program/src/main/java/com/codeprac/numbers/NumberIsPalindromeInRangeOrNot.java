package com.codeprac.numbers;

public class NumberIsPalindromeInRangeOrNot {

    public static boolean isPalindrome(int number){
        int reverseNum = 0;
        if (number < 0){
            return false;
        }
        int temp = number;

        while (number != 0){
            int lastDigit = number % 10;
            reverseNum =  reverseNum * 10 + lastDigit;
            number /= 10;
        }

        return temp == reverseNum;
    }

    public static void main(String[] args) {
        int min = 100;
        int max = 1000;

        for (int i = min; i < max; i++){
            if (isPalindrome(i)){
                System.out.println(i + " ");
            }
        }
    }
}
