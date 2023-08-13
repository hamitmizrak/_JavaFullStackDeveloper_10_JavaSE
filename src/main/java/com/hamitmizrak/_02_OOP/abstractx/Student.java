package com.hamitmizrak._02_OOP.abstractx;

public class Student  extends Person {

    @Override
    public void govdeliMethod(String data) {
        System.out.println("Student: "+data);
    }

    @Override
    public void govdesizMethod(String data) {
        System.out.println("Gövdesiz method: "+data);
    }
}
