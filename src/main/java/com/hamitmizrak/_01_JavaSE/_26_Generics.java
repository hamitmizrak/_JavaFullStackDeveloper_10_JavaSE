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
public class _26_Generics<T> {

    private String name;
    private T surname;

    public static void main(String[] args) {
        _26_Generics data = new _26_Generics();
        data.setName("Adı 6666");
        data.setSurname(4545.541515);
        System.out.println(data);
    }
}
