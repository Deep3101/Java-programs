package com.codeprac.qpaixcodingque;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {

    private static void findAllSubSequence(int i, List<Integer> list, int[] arr, int n) {
        if (i == n){
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        findAllSubSequence(i+1,list,arr,n);
        list.removeLast();

        findAllSubSequence(i+1,list,arr,n);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        findAllSubSequence(0,list,arr,n);
    }


}
