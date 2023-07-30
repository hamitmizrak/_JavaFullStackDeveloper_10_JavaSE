package com.hamitmizrak._01_JavaSE;

import java.util.Scanner;


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
public class _17_RecursiveMethod_IterativeMethod {

    // Kullanıcıdan alına bir sayıyı faktöriyeli hesaplayan java algoritmasını yazınız. ?

    // User Data
    public int useData() {
        int number;
        Scanner userNumber = new Scanner(System.in);
        System.out.print("\nBir Sayı Giriniz: ");
        number = userNumber.nextInt();
        return number;
    }

    // ITERATIVE
    public int iterativeFactoriyel(int number) throws _0_HamitMizrak {
        int temp = 1; // unutma çarpmada 1 etkisiz elemandır.

        // Sıfırdan Küçük Girerse Exception Fırlatsın.
        if (number < 0) {
            //throw new _0_HamitMizrak("Faktöriyel için Sıfırdan Küçük Giremezsiniz");
            System.err.println("Negatif Sayı Giremezsiniz");
            number=Math.abs(number);
        }
        //Faktöriyel Sıfır veya Bir
        if (number == 0 || number == 1)
            return 1;
        else {
            for (int i = number; i >= 1; i--) {
                temp *= i;
            }
            return temp;
        } //end else
    } //end method iterativeFactoriyel

    public static void main(String[] args) throws _0_HamitMizrak {
        _17_RecursiveMethod_IterativeMethod method = new _17_RecursiveMethod_IterativeMethod();
        for (;;) {
            /*
            int number = method.useData();
            int result = method.iterativeFactoriyel(number);
            System.out.println(result);
            */

            System.out.println( method.iterativeFactoriyel(method.useData()));
        }
    }// end PSVM
}// end Class
