package com.hamitmizrak._01_JavaSE;

import java.util.Scanner;

public class _14_Method_Examples_2 {
    // Username and surname Masking
    // kullanıcı tarafından girilen adı ve soyadını için;
    // adı: ilk harf büyük son harf küçük arada kaç tane harf varsa o kadar * eklensin.
    // soyad: ilk 3 harfi Büyük sonra * eklensin
    // Hamit Mızrak ==> H***T MIZ***
    // Metot ile göstereceksiniz ?

    // FULLNAME
    public static String fullName() {
        Scanner klavye = new Scanner(System.in);
        String fullName = null;
        System.out.println("Adınız ve soyadınız boşluk bırakarak yazınız");
        return klavye.nextLine();
    }

    // NAME
    public static String name(String fullName) {
        String name = null;
        // NAME
        name = fullName.substring(0, fullName.indexOf(" "));
        name = name.toUpperCase();
        System.out.println(name);
        for (int i = 1; i < name.length() - 1; i++) {
            name = name.replace(name.charAt(i), '*');
        }
        System.out.println(name);
        System.out.println("*********************************");
        return name;
    }

    // NAME
    public static String surname(String fullName) {
        String surname = "";
        surname = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
        // SURNAME
        if (surname.length() >= 4) {
            surname = surname.toUpperCase();
            System.out.println(surname);
            for (int i = 3; i < surname.length(); i++) {
                surname = surname.replace(surname.charAt(i), '*');
            }
            System.out.println(surname);
        }
        return surname;
    }

    public static void nameOrSurname() {
        String fullName = fullName();
        String name = name(fullName);
        String surname = surname(fullName);
    }

    public static void main(String[] args) {
        nameOrSurname();
    }

}
