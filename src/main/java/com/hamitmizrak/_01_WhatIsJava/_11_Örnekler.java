package com.hamitmizrak._01_WhatIsJava;

import java.util.Scanner;

public class _11_Örnekler {
    public static void main(String[] args) {

        // ÖRNEK-1
        // Kullanıcıdan alınan sayıya göre negatif mi? pozitif mi ?
        // sonsuz döngüyü  gösteren java algoritmasını yazınız ?
        // Validation: Kullanıcı eğer +1000 veya -1000 girerse sonsuz döngüden çıksın.(break)
        // Validation: Kullanıcı eğer special number 44 verdi bunu görmezden gelsin. (continue)

        /*
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nSayı giriniz : ");
            int userDataValue = scanner.nextInt();

            //validation (break)
            if(userDataValue>=1000 || userDataValue<=-1000){
                System.out.println("Lütfen +1000 büyük veya -1000 küçük girmeyiniz");
                break;
            }

            //validation (continue)
            if(userDataValue==44){
                System.out.println("special Number");
                continue;
            }

            if (userDataValue == 0)
                System.out.println(userDataValue + " sayısı nötrdür.");
            else if (userDataValue < 0)
                System.out.println(userDataValue + " sayısı negatiftir.");
            else
                System.out.println(userDataValue + " sayısı pozitiftir.");
        }
        */

        // ÖRNEK-2
        // Kullanıcıdan alınan password ve  repassword  göre;
        // eğer iki değişken eşitse eşit değise şifreler birbirine uymuyor yazsın
        // java algoritmasını yazınız ?
        // kullanıcıdan alınan password ve repassword
       /* while (true) {
            Scanner scanner = new Scanner(System.in);
            String password = "", rePassword = "";

            System.out.print("\nŞifrenizi giriniz. : ");
            password = scanner.nextLine();

            System.out.print("Şifrenizi tekrar giriniz. : ");
            rePassword = scanner.nextLine();

            if (password.equals(rePassword))
                System.out.println("iki değişkende aynı tamamdır");
            else
                System.out.println("Dikkat !!! Şifreler uyumlu değil. ");
        }*/

        // ÖRNEK-3
        // Radar uygulaması, Kullanıcıdan alınan sayıya göre, eğer hızınız;
        // HIZ>=90  yavaşlayın
        // HIZ>=110  hızlısınız, yavaşlayın ceza: 5000TL
        // HIZ>=130  hızlısınız, yavaşlayın ceza: 10000TL
        // HIZ>=150  hızlısınız, yavaşlayın ceza: 50000TL ve ehliyetine el konuldu.
        // Kullanıcının toplam para cezasını göstersin

        Scanner scanner =new Scanner(System.in);
        int sum=0;
        for (;;) {
            System.out.println("Hız giriniz : ");
            int userSpeed = scanner.nextInt();
            if (80<=userSpeed  && userSpeed<=90){
                System.out.println("yavaşlayın.");
                System.out.println("Toplam para cezanız: "+sum);
               // break;
            }else if( 90<userSpeed && userSpeed<=110){
                System.out.println("Çok hızlısınız yavaşlayın. Cezanız : 5000TL");
                sum=sum+5000;
                System.out.println("Toplam para cezanız: "+sum);
                //break;
            }else if(110<userSpeed && userSpeed<=130){
                System.out.println("Çok hızlısınız yavaşlayın. Cezanız : 10000TL.");
                sum+=10000;
                System.out.println("Toplam para cezanız: "+sum);
               // break;
            } else if(userSpeed>130 ){
                System.out.println("Çok hızlısınız yavaşlayın. Cezanız : 50000TL");
                sum+=50000;
                System.out.println("Toplam para cezanız: "+sum);
               // break;
            }
        }



        // ÖRNEK-4: Kullanıcının girdiği sembole göre harf mi, sayı mı , özel karakter mi bulan  java algoritması?

        // ÖRNEK-5 VKI (Vucut Kitle Index) Hesaplama
        // Kullanıcıdan alınan ağırlık ve kiloya göre VKI hesaplayan Java Algoritmasını yazınız ?
        // Formül: BMI = Ağırlık (kg) / Boy^2

        // ÖRNEK-6
        // Örnek: 1-10 arasında 5 tane random sayı üretelim ?
        // Bu sayılar nelerdir
        // Bu sayıları toplayalım
        // Bu sayılar içinde tek sayı toplamı
        // Bu sayılar içinde tek sayı adeti


        // ÖRNEK-7 : Sayı Tahmin oyunu ?
        // Bilgisayar rastgele 1-20 arasında bir sayı üretsin bizde bnu sayıyı tahmin edelim.
        // Validation: Kullanıcı bilgisayarın ürettiği bu sayı için 3 hakkı bulunmaktadır.
        // eEğer kullanıcı bilgisayar sayıyısına yakınlığı 5 eksik ve fazlaysa söylesin.

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ÖDEV-1
        // Vize Final Ödevi
        // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama) Algoritması
        // eğer kullanıcı vize veya final 0(sıfır) bir değer girerse sistemden atsın
        // ekranda "Sifir disiplin hatasi Sistemden cikiliyor"
        // bunun haricinde sürekli vize final sorsun
        // Not Harfleri ==> AA BA BB FF
        // not ortalaması: ortalama<50 altında ise kaldı FF
        // not ortalaması: ortalama==50 Geçti
        // not ortalaması: 55<=x<=69 BB
        // not ortalaması: 70<=x<=84 BA
        // not ortalaması: 85<=x<=100 AA
        // Vize:40% Final:60%
        // Dikkat: Consolda virgül kullanmalısın.
        // while sonsuz döngü   ==> while(true) {}
        // for sonsuz döngü     ==> for(;;) {}

        // ÖDEV-2
        // Username and surname Masking
        // kullanıcı tarafından girilen adı ve soyadını için;
        // adı: ilk harf büyük son harf küçük arada kaç tane harf varsa o kadar * eklensin.
        // soyad: ilk 3 harfi Büyük sonra * eklensin
        // Hamit Mızrak ==> H***T MIZ***

    }
}
