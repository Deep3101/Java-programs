package com.codeprac.java8;

import java.util.Arrays;
import java.util.List;

public class FindDuplsFromGivenString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "b", "b","c" ,"e", "f", "g","g","h","h","h");

        List<String> result = list.stream().distinct().toList();
        System.out.println(result);
    }
}
