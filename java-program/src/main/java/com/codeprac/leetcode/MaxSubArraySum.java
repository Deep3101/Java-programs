package com.codeprac.leetcode;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));
    }

//    private static int maxSubArray(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        int maxi = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (sum > maxi){
//                maxi = sum;
//            }
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//        return maxi;
//    }

    private static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
}
