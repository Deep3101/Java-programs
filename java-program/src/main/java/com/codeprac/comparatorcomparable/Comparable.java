package com.codeprac.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements java.lang.Comparable<Student> {
    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.studentId - student.studentId;
    }
}
public class Comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 18, 1));
        list.add(new Student("Jane", 19, 2));
        list.add(new Student("Jack", 20, 3));
        list.add(new Student("Jill", 15, 4));

        Collections.sort(list);
        System.out.println(list);


    }
}
