package com.codeprac.nestedclasses;

class Car{
    void run(){
        class Engine{
            void start(){
                System.out.println("This is a car engine");
            }
        }
        Engine engine = new Engine();
        engine.start();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }
}
