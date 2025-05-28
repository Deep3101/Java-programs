package com.codeprac.arrays;

import java.util.Arrays;

public class AddElementInArr {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,6,11};
        int newElem = 21;
        int position = 3;

        int[] newArr = new int[arr.length + 1];
        newArr[0] = newElem;

        for (int i = 0; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        System.out.println("Adding elem at the beginning : " + Arrays.toString(newArr));

        for (int  i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = newElem;

        System.out.println("Adding elem at the end : " + Arrays.toString(newArr));

        for (int  i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = newElem;

        System.out.println("Adding elem at the position : " + Arrays.toString(newArr));
    }
}
