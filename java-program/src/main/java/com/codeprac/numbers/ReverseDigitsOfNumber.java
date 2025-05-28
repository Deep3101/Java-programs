package com.codeprac.numbers;

public class ReverseDigitsOfNumber {

    public static int reverseNumber(int number){
        int reverseNum = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number = number / 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reverse Number is : " + reverseNumber(num));
    }
}
