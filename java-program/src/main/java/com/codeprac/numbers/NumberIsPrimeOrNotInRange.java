package com.codeprac.numbers;

public class NumberIsPrimeOrNotInRange {

    public static boolean isPrime(int number){
        int count = 0;

        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }

        if (count == 2){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int min = 100;
        int max = 1000;

        for (int i = min; i < max; i++){
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
}
