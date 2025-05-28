package com.codeprac.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,45,77,58,63,27,10,11,9};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
