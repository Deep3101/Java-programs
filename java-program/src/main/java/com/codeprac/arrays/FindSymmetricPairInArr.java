package com.codeprac.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSymmetricPairInArr {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 20},
                {30, 40},
                {20, 11},
                {40, 30},
                {5, 10}
        };

        findSymmetricPair(arr);
    }

    private static void findSymmetricPair(int[][] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int[] pair : arr){
            int first = pair[0];
            int second = pair[1];

            if (map.containsKey(second) && map.get(second) == first){
                System.out.println("(" + second + ", " + first + ") and (" + first + ", " + second + ")");
            } else {
                map.put(first,second);
            }
        }
    }
}
