package com.hamitmizrak._02_OOP.inheritancex;

public class MainInheritance {
    public static void main(String[] args) {

        Person person=new Person();
        person.setId(1L);
        person.setUsername("Person Username");
        person.setPassword("Person password");
        person.setEmailAddress("Personhamitmizrak@gmail.com");
        person.setTelNumber("+90444");
        System.out.println(person);

        System.out.println("**************************");
        Teacher teacher=new Teacher();
        teacher.setId(1L);
        teacher.setUsername("Student Username");
        teacher.setPassword("Student password");
        teacher.setEmailAddress("studenthamitmizrak@gmail.com");
        teacher.setTelNumber("+90444");
        System.out.println(teacher);
        System.out.println("**************************");

        Student student=new Student();
        student.setId(1L);
        student.setUsername("Teacher Username");
        student.setPassword("Teacher password");
        student.setEmailAddress("hamitmizrak@gmail.com");
        student.setTelNumber("+90555");
        System.out.println(student);
        System.out.println("**************************");
    }
}
