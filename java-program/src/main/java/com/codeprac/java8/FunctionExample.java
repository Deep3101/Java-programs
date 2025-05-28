package com.codeprac.java8;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> function = str -> str.length();
        System.out.println(function.apply("hello"));
   }
}

//function transforms input into output