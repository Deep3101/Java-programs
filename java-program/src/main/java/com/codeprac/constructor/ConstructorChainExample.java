package com.codeprac.constructor;

class Employee {
    int id , age;
    String name;

    public Employee(int age){
        this.age = age;
    }

    public Employee(int id, String name, int age){
        this(age);
        this.id = id;
        this.name = name;
    }

}
public class ConstructorChainExample {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"deep",12);
        System.out.println("id : " + emp.id + " name : " + emp.name + " age : " + emp.age);
    }
}
