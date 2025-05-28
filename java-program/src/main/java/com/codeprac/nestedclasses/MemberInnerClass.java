package com.codeprac.nestedclasses;

public class MemberInnerClass {

    class InnerClass{
        void show(){
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.InnerClass innerClass = memberInnerClass.new InnerClass();
        innerClass.show();
    }
}
