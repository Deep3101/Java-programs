package com.codeprac.java8;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> String.valueOf(Math.random());
        System.out.println(supplier.get());
    }
}

//supplies a value ,output only, no input