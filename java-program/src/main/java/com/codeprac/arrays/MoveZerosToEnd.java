package com.codeprac.arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {27,1,2,8,9,0,5,0,3,0,4,23};
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
