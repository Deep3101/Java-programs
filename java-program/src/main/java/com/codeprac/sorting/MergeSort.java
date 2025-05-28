package com.codeprac.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    void mergeSort(int[] arr, int low, int high){
        if(low == high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        if (low == high){
            return;
        }

        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++){
            arr[low + i] = temp.get(i);
        }

    }
    public static void main(String[] args) {
        int[] arr = {12,45,77,58,63,27,10,11,9};
        int n =arr.length;

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, n-1);

        System.out.print("{");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.print("}");


    }
}
