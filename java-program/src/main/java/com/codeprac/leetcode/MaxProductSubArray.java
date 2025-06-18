package com.codeprac.leetcode;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        System.out.println(maxProductSubArray(nums));
    }

    private static int maxProductSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxi = Math.max(maxi, product);
            }
        }
        return maxi;
    }
}
