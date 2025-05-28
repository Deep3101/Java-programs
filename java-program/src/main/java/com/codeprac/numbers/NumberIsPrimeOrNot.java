package com.codeprac.numbers;

public class NumberIsPrimeOrNot {

    public static boolean isPrime(int number) {
        int count = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 14;

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
