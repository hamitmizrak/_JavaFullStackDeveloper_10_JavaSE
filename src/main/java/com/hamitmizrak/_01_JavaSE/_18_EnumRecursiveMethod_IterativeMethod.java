package com.hamitmizrak._01_JavaSE;
import java.util.Scanner;

// ENUM: aylar, günler, ölçüler: genel geçer herkes için aynı olan durumlara denir.
// data type


public class _18_EnumRecursiveMethod_IterativeMethod {

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
    private int iterativeFactoriyel(int number) throws _0_HamitMizrak {
        int temp = 1; // unutma çarpmada 1 etkisiz elemandır.

        // Sıfırdan Küçük Girerse Exception Fırlatsın.
        if (number < 0) {
            //throw new _0_HamitMizrak("Faktöriyel için Sıfırdan Küçük Giremezsiniz");
            System.err.println("Negatif Sayı Giremezsiniz");
            number = Math.abs(number);
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


    // RECURSIVE
    private int recursiveFaktoriyel(int number) throws _0_HamitMizrak {
        int temp = 1; // unutma çarpmada 1 etkisiz elemandır.

        // Sıfırdan Küçük Girerse Exception Fırlatsın.
        if (number < 0) {
            //throw new _0_HamitMizrak("Faktöriyel için Sıfırdan Küçük Giremezsiniz");
            System.err.println("Negatif Sayı Giremezsiniz");
            number = Math.abs(number);
        }
        //Faktöriyel Sıfır veya Bir
        if (number == 0 || number == 1)
            return 1;
        else {
            return number * recursiveFaktoriyel(number - 1);
        } //end else
    } //end method recursiveFaktoriyel

    public void chooiseIterativeOrRecursive() throws _0_HamitMizrak {
        for (; ; ) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("\nLütfen Seçiniz:\n1-)"+_18_ChooiseIterativeRecursive.ITERATIVE_ENUM.toString()+ "\n2-)"+_18_ChooiseIterativeRecursive.RECURSIVE_ENUM.toString());
            int chooise = klavye.nextInt();
            switch (chooise) {
                case 1:
                    int number = useData();
                    int result = iterativeFactoriyel(number);
                    System.out.println(number+" sayısınını Iterative Sonucu: "+ result);
                    break;

                case 2:
                    int number2 = useData();
                    int result2 = iterativeFactoriyel(number2);
                    System.out.println(number2+" sayısınını Recursive Sonucu: "+ result2);
                    //System.out.println(recursiveFaktoriyel(useData()));
                    break;

                default:
                    System.out.println("sadece 1 veya 2 seçilecektir.");
                    break;
            }
        }
    }

    public static void main(String[] args) throws _0_HamitMizrak {
        _18_EnumRecursiveMethod_IterativeMethod method = new _18_EnumRecursiveMethod_IterativeMethod();
        method.chooiseIterativeOrRecursive();
    }// end PSVM


}// end Class
