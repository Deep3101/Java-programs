package com.codeprac.objectclone;


/**
 * Below is the example of Shallow copy and Deep copy
 * Shallow copy :- for object type variables it only copies the reference of the object, default implementation of the clone method returns the shallow
 * copy of the object
 * Deep copy :- for object type variables entire object is been copied
 * we need to additionally call the clone method of the object type variable to achieve deep copy
 */
class Address implements Cloneable{
    int addressId;

    @Override
    public Address clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class Student implements Cloneable {
    int rollNo;
    Address address;

    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            student.address = address.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return (Student) super.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class ObjectCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 5;

        Address address = new Address();
        address.addressId = 15;

        s1.address = address;

        Student s2 = s1.clone();  //reference copy
        s2.rollNo = 10;
        s2.address.addressId = 17;

        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);

        System.out.println(s1.address.addressId);
        System.out.println(s2.address.addressId);
    }
}
