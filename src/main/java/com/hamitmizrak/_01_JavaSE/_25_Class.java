package com.hamitmizrak._01_JavaSE;


// Generics
// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class _25_Class {

    private String name;
    private String surname;

    public static void main(String[] args) {
        _25_Class data=new _25_Class();
        data.setName("Adı 6666");
        data.setSurname("Soyadı 6666");
        System.out.println(data);
    }
}
