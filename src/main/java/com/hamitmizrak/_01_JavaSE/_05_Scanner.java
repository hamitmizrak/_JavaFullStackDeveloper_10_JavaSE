package com.hamitmizrak._01_JavaSE;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {

        // escape character
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("merhabalar");
        System.out.println("\tmerhabalar");
        System.out.println("1.satır\n2.satır");

        // System
        // System.in();  // veri almak
        // System.out(); //çıktı almak

        // Scanner
        java.util.Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen Adınızı soyadınız giriniz");
        String nameAndSurname=klavye.nextLine();
        System.out.println(nameAndSurname);

        System.out.println("Lütfen sayı giriniz.");
        int number=klavye.nextInt();
        System.out.println(Math.pow(number,2));

    }
}
