package com.codeprac.exception;


class Main{
    void a(){
        try {
            System.out.println("a() is called");
            b();
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
    void b() throws Exception{
        try {
            System.out.println("b() is called");
            c();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("Finally block executed");
        }
    }
    void c() throws Exception{
        throw new Exception();
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        Main m = new Main();
        m.a();
    }
}
