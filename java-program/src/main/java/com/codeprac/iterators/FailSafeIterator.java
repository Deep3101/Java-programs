package com.codeprac.iterators;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String str : list){
            list.add("D");
            System.out.println(str);

        }

    }
}
