package com.codeprac.arrays;

public class ProdOfNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] resultArr = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= arr[j];
                }
            }
            resultArr[i] = prod;
        }

        for (int val : resultArr) {
            System.out.print(val + " ");
        }
    }
}
