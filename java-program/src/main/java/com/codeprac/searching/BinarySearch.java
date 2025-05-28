package com.codeprac.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                return mid;
            }

            if (target < arr[mid]){
                right = mid - 1;
            }

            if (target > arr[mid]){
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,45,77,58,63,27,10,11,9};
        int target = 63;

        int result = binarySearch(arr, target);

        if (result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
