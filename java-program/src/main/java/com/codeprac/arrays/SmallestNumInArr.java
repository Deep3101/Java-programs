package com.codeprac.arrays;

public class SmallestNumInArr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,44,11,3,6};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
