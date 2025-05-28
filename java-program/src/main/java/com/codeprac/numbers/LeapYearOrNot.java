package com.codeprac.numbers;

public class LeapYearOrNot {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 2020;

        if (isLeapYear(num)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
