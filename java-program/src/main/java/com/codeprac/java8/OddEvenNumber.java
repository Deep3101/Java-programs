package com.codeprac.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 6, 7, 9, 10);

        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0)
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(result);

    }
}
