package com.codeprac.constructor;


class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
    }

    public void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(18, "John");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
