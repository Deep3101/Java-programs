package com.codeprac.arrays;

import java.util.Arrays;

public class ArraysInIncrDecrOrder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6};
        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n/2; i++) {
            System.out.println(arr[i]);
        }
        for (int i = n - 1; i >= n/2; i--) {
            System.out.println(arr[i]);
        }
    }
}
