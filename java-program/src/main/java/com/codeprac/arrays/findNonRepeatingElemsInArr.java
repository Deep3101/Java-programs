package com.codeprac.arrays;

import java.util.HashMap;
import java.util.Map;

public class findNonRepeatingElemsInArr {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        int n = arr.length;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(arr[i],freq.getOrDefault(arr[i],0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()){
//            if(entry.getValue() == 1){
//                System.out.println(entry.getKey() + " "); // non repeating elems
//            }
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " "); // repeating elems
            }
        }
    }
}
