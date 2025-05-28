package com.codeprac.objectclone;

class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee(1, "John");
        Employee employee2 = (Employee) employee1.clone();

        System.out.println(employee1.id + " " + employee1.name);
        System.out.println(employee2.id + " " + employee2.name);
    }
}
