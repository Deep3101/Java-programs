package com.codeprac.arrays;

import java.util.Arrays;

public class SecondSmallestAndSecondLargestInArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6};
//        Arrays.sort(arr);
//
//        System.out.println(arr[1]);
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println(secondSmallest + " " + smallest);

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println(secondLargest + " " + largest);
    }
}