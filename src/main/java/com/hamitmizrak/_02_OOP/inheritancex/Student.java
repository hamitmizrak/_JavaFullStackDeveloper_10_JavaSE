package com.hamitmizrak._02_OOP.inheritancex;

public class Student  extends Person {


    @Override
    public void govdeliMethod(String data) {
        System.out.println("Student: "+data);
    }
}
