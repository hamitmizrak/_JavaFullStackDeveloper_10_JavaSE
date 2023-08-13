package com.hamitmizrak._02_OOP.abstractx;

public class MainAbstract {
    public static void main(String[] args) {

        Person person=new Teacher(); // polymorphism
        person.setId(1L);
        person.setUsername("Person Username");
        person.setPassword("Person password");
        person.setEmailAddress("Personhamitmizrak@gmail.com");
        person.setTelNumber("+90444");
        person.govdeliMethod("polymorphism");
        System.out.println(person);

        System.out.println("**************************");
        Teacher teacher=new Teacher();
        teacher.setId(1L);
        teacher.setUsername("Student Username");
        teacher.setPassword("Student password");
        teacher.setEmailAddress("studenthamitmizrak@gmail.com");
        teacher.setTelNumber("+90444");
        teacher.govdeliMethod("+teacher");
        teacher.govdesizMethod("+teacher gövdesiz");
        System.out.println(teacher);
        System.out.println("**************************");

        Student student=new Student();
        student.setId(1L);
        student.setUsername("Teacher Username");
        student.setPassword("Teacher password");
        student.setEmailAddress("hamitmizrak@gmail.com");
        student.setTelNumber("+90555");
        student.govdeliMethod("+student");
        teacher.govdesizMethod("+student gövdesiz");
        System.out.println(student);
        System.out.println("**************************");
    }
}
