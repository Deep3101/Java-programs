package com.codeprac.sorting;

import java.util.Arrays;

public class QuickSort {

    void quickSort(int[] arr, int low, int high){
        if(low == high){
            return;
        }
        if(low < high){
            int partIndex = partitionIndex(arr,low,high);
            quickSort(arr,low,partIndex - 1);
            quickSort(arr,partIndex+1,high);
        }
    }

    int partitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while (arr[i] <= pivot && i <= high){
                i++;
            }
            while (arr[j] > pivot && j >= low + 1){
                j--;
            }
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {12,45,77,58,63,27,10,11,9};
        int n =arr.length;
        QuickSort qs = new QuickSort();
        qs.quickSort(arr,0,n - 1);

        for (int num : arr){
            System.out.print(num + " ");
        }

        System.out.println(Arrays.toString(arr));

    }
}
