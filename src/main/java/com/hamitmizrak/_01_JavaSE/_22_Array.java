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

        System.out.println("\n");
        int[] [] matrix=new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        for (int i = 0; i <matrix.length ; i++) {
            for (int k = 0; k <matrix[i].length ; k++) {
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }
}
