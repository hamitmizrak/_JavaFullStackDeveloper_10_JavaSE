package com.hamitmizrak._01_JavaSE;
// ÖDEV: Asal sayı  yazınız ?
// Java By Pass value mi ? (Kubilay)
// decoder encoder araştırma ödevi ? (Faruk)
// JAR-WAR  araştırma ödevi ? (Anıl)
// String ters yazmak (StringReverse) ==>Girilen kelimeyi ters yazdıran algoritma ?
// Palindrom (Metotla yapıyorsunuz)// Girilen bir kelimenin tersten okunuşu ve düzden okunuşu aynı ise AMA
// INNER CLASS

// GELECEK HAFTA: Diziler, başlıyoruz.
// FILE
// Thread
// COLLECTION
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class _20_InnerClass {

    @Getter @Setter
    private String countyName;

    @Getter @Setter
    private String countyCode;

    public static class City{
        @Getter @Setter
        private String cityName;

        @Getter @Setter
        private String cityCode;
    }
}

class InnerClassMain{
    public static void main(String[] args) {
        _20_InnerClass country=new _20_InnerClass();
        country.setCountyName("Türkiye");
        country.setCountyCode("+90");

        _20_InnerClass.City city=new _20_InnerClass.City();
        city.setCityName("Malatya");
        city.setCityCode("44");

        String str=country.getCountyName()+" "+country.getCountyCode()+" "+city.getCityName()+" "+city.getCityCode();
        System.out.println(str);
    }
}

// File: Absolute path, Relative Path
// URL, URI
// FileWriter, BufferedWriter FileReader, BufferedReader
// DTO, DAO, Controller
// Generics
// Collection
// Threading nedir ?
// Senkron nedir ?
// Asenkron nedir ?
