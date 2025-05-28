package com.codeprac.iterators;

import java.util.ArrayList;

import java.util.List;

public class FailFastIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer integer : list) {
            System.out.println(integer);
            list.add(4);
        }
    }
}
