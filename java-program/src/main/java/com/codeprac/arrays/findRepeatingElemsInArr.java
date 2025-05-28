package com.codeprac.arrays;

import java.util.Arrays;

public class findRepeatingElemsInArr {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        Arrays.sort(arr);

//        for (int i = 0; i < arr.length - 1; i++){
//            if (arr[i] == arr[i+1]){
//                System.out.println(arr[i] + " ");
//            }
//        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        int[] uniqueArr = Arrays.copyOfRange(arr, 0,i + 1);
        System.out.println(Arrays.toString(uniqueArr));
    }
}
