package com.codeprac.java8;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
    }
}

//consumes the value , accepts only, no return
