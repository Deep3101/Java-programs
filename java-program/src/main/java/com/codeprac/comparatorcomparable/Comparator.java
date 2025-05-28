package com.codeprac.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {

    String name;
    int empId;
    int age;

    public Employee(String name, int empId, int age) {
        this.name = name;
        this.empId = empId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                '}';
    }
}
public class Comparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("deep",1,18));
        employees.add(new Employee("sam",2,17));
        employees.add(new Employee("max",3,13));

        Collections.sort(employees, new NameComparator());
        Collections.sort(employees, new EmpIdComparator());
        System.out.println(employees);
    }
}
