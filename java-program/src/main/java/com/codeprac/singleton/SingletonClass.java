package com.codeprac.singleton;

class Singleton{
    private static final Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("Private singleton constructor");
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("Inside show method");
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.show();
        s2.show();
        System.out.println(s1 == s2);
    }
}
