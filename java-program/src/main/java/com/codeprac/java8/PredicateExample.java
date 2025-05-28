package com.codeprac.java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n % 2 == 0;
        System.out.println(predicate.test(5));
    }
}

//predicate tests the condition and return boolean value
