package com.codeprac.arrays;

import java.util.Arrays;

import static com.codeprac.arrays.RightRotateArray.reverseArr;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        leftRotateArr(arr, k);
        System.out.println(Arrays.toString(arr));

    }

    private static void leftRotateArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);
        reverseArr(arr, 0, n - 1);
    }
}
