package com.hamitmizrak._01_WhatIsJava;

import java.util.Date;
import java.util.Scanner;

public class _14_Method {

    // kendimizi tekrar yapmamak için
    // daha az kod yazmak

    // 1-) parametresiz Returnsuz
    public static void parametresizReturnsuz() {
        System.out.println("parametresiz Returnsuz");
    }

    // 2-) parametresiz Returnsuz
    public static void parametreliReturnsuz(int sayi, String str) { //parametre
        System.out.println("parametreli Returnsuz " + sayi + " " + str.toUpperCase());
    }

    // 3-) parametresiz Returnlu
    public static double parametresizReturnlu() {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scanner.nextInt();
        double powNumber = Math.pow(number, 2);
        return powNumber;*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        return Math.pow(scanner.nextInt(), 2);
    }

    // 4-) parametresiz Returnlu
    public static int parametreliReturnlu(int number) {
        return Math.abs(number);
    }

    public static void main(String[] args) {
        parametresizReturnsuz();
        parametreliReturnsuz(44, "Malatya"); //arguman

        double result1 = parametresizReturnlu();
        System.out.println(result1);

        double result2 = parametreliReturnlu(-23);
        System.out.println(result2);
    }


}
