package com.codeprac.arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,44,11,3,6};
        int start = 0;
        int end =  arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
