package com.codeprac.arrays;

public class AvgOfElemsInArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6};
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.println("The average of elements in an array is: " + avg);
    }
}
