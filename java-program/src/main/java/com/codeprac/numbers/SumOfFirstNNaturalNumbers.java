package com.codeprac.numbers;

public class SumOfFirstNNaturalNumbers {

    public static int sumOfFirstNNaturalNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println(sumOfFirstNNaturalNumber(num));
    }
}
