package com.codeprac.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfEachElemInArr {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 44, 11, 3, 6, 2, 5, 4, 6, 1};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
