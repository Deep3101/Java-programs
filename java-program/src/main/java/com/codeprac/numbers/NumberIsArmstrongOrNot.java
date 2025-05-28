package com.codeprac.numbers;

public class NumberIsArmstrongOrNot {

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int digit = String.valueOf(number).length();
        int originalNum = number;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += (int) Math.pow(lastDigit, digit);
            number /= 10;
        }

        return originalNum == sum;
    }

    public static void main(String[] args) {
        int num = 370;

        if (isArmstrong(num)){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
