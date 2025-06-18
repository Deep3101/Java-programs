package com.codeprac.leetcode;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(minimumInRotatedSortedArray(arr));
    }

    private static int minimumInRotatedSortedArray(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] < arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
