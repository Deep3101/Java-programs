package com.codeprac.arrays;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        rightRotateArr(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArr(arr, 0, n - 1);
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);
    }

    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
