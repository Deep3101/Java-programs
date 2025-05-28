package com.codeprac.arraylist;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(60);
        list.add(70);
        list.add(90);
        list.add(50);
        list.add(75);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Comparator<Object> comparator = Collections.reverseOrder();
        list.sort(comparator);
        System.out.println(list);
    }
}
