package com.codeprac.iterators;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            map.put("D", 4);
        }
    }
}
