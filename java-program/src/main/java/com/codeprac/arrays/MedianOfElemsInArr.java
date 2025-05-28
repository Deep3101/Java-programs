package com.codeprac.arrays;

public class MedianOfElemsInArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6};
//        double median = 0;
//        int n = arr.length;
//
//        if(n % 2 != 0){
//            median = arr[n/2];
//        } else {
//            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
//        }
//        System.out.println(median);
        double median = 0;
        int n = arr.length;

        if (n % 2!= 0){
            median = arr[n/2];
        } else {
            median = (arr[n/2] + arr[n/2-1]) / 2.0;
        }
        System.out.println(median);
    }
}
