package com.hamitmizrak._01_JavaSE;

// GELECEK HAFTA: Diziler, başlıyoruz.
// FILE
// Thread
// COLLECTION
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

// File: Absolute path, Relative Path
// URL, URI
// FileWriter, BufferedWriter FileReader, BufferedReader
// DTO, DAO, Controller
// Generics
// Collection
// Threading nedir ?
// Senkron nedir ?
// Asenkron nedir ?
// SQL nedir ?
public class _22_Array {
    public static void main(String[] args) {
        int [] diziAdi=new int[10];
        diziAdi[0]=1;
        diziAdi[1]=2;
        diziAdi[2]=3;
        diziAdi[3]=4;
        diziAdi[4]=5;
        diziAdi[5]=6;
        diziAdi[9]=8;

        System.out.println(diziAdi[0]);
        System.out.println(diziAdi[9]);
        System.out.println(diziAdi[diziAdi.length-1]);

        // iterative for indisi
        for (int i = 0; i < diziAdi.length; i++) {
            System.out.println(i+" "+diziAdi[i]+" ");
        }

        System.out.println("\n************\n");
        for(int temp : diziAdi){
            System.out.print(temp+" ");
        }

    }
}
