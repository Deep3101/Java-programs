package com.codeprac.leetcode;

import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {

    public static void mergeSortedArr(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int gap = (length / 2) + length % 2;

        for (int i = 0; i < gap; i++) {
            nums1[m + i] = nums2[i];
        }

        while (gap > 0){
            int left = 0;
            int right = left + gap;
            while (right < length){
                if (nums1[left] > nums1[right]){
                    int temp = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = temp;
                }
                left++;
                right++;
            }

            if (gap == 1){
                gap = 0;
            } else {
                gap = (gap / 2) + gap % 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        mergeSortedArr(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
