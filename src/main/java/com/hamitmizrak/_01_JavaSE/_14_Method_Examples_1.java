package com.hamitmizrak._01_JavaSE;

import java.util.Scanner;

public class _14_Method_Examples_1 {
    // Username and surname Masking
    // kullanıcı tarafından girilen adı ve soyadını için;
    // adı: ilk harf büyük son harf küçük arada kaç tane harf varsa o kadar * eklensin.
    // soyad: ilk 3 harfi Büyük sonra * eklensin
    // Hamit Mızrak ==> H***T MIZ***
    // Metot ile göstereceksiniz ?

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String name=null,surname ="",fullName=null;

        // FULL NAME
        System.out.println("Adınız ve soyadınız boşluk bırakarak yazınız");
        fullName=klavye.nextLine();

        // NAME
        name=fullName.substring(0,fullName.indexOf(" "));
        name=name.toUpperCase();
        System.out.println(name);
        for (int i = 1; i < name.length()-1; i++) {
           name=name.replace(name.charAt(i), '*');
        }
        System.out.println(name);
        System.out.println("*********************************");

        // SURNAME
        surname=fullName.substring(fullName.indexOf(" ")+1,fullName.length());
        if(surname.length()>=4){
            surname=surname.toUpperCase();
            System.out.println(surname);
            for (int i = 3; i < surname.length(); i++) {
                surname=surname.replace(surname.charAt(i), '*');
            }
            System.out.println(surname);
        }

    }
}
