package com.codeprac.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(arr)));
    }

    private static int[] productOfArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int productBeforeAllCurrent = 1;
        int productAfterAllCurrent = 1;

        for (int i = 0; i < n; i++) {
            res[i] = productBeforeAllCurrent;
            productBeforeAllCurrent *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[i] = productAfterAllCurrent;
            productAfterAllCurrent *= arr[i];
        }
        return res;
    }
}
