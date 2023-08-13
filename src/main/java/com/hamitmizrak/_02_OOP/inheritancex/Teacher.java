package com.hamitmizrak._02_OOP.inheritancex;

public class Teacher extends Person {


    @Override
    public void govdeliMethod(String data) {
        System.out.println("Teacher: "+data);
    }
}
