package com.hamitmizrak._01_JavaSE;

import java.util.UUID;

public class _15_OtherCommon {

    // Overloading
    public void deneme(){}
    public void deneme(String data){}
    public void deneme(int sayi){}

    public static void main(String[] args) {

        // Random UUID
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        // static: new yapmadan classAdi. değişken
        String db=CommonInformation.DATABASE_INFO;
        System.out.println(db);

        // final
        // final finally finalize

        // Encapsulation (private)
        // Override
        // Overloading

        // Access Modifier
        // public, protected, private, -(friendly,default)

        // Recursive,-iterative method
        // Faktöriyel iterative ve recursive yazınız ?
        // ENUM

        // ÖDEV: Asal sayı  yazınız ?
        // Java By Pass value mi ? (Kubilay)
        // decoder encoder araştırma ödevi ? (Faruk)
        // JAR-WAR  araştırma ödevi ? (Anıl)

        // GELECEK HAFTA: Diziler, başlıyoruz.
        // FILE
        // Thread
        // COLLECTION
        // OOP GİRİŞ, inheritance, abstract, interface
        // Java 8 gelen özellikler
    }
}