package com.codeprac.java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,3,4,4,4,5,5,5,6,7,8,8,8,9,9,10);

        List<Integer> res = list.stream().distinct().toList();
        System.out.println(res);
    }
}
