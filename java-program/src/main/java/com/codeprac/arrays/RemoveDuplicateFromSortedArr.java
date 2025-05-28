package com.codeprac.arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,6,7,7,8,8,8,9,9,9};
//        Arrays.stream(arr).forEach(System.out::println);

        Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);
        int n = arr.length;
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int[] uniqueArr = Arrays.copyOfRange(arr, 0, i + 1);

        System.out.println(Arrays.toString(uniqueArr));
    }
}
