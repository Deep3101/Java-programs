package com.codeprac.nestedclasses;

abstract class Animal {
    abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void show() {
                System.out.println("This is an Animal");
            }
        };
        animal.show();
    }
}
