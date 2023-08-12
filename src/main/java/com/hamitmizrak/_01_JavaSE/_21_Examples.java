package com.hamitmizrak._01_JavaSE;

import java.util.Scanner;

public class _21_Examples {

    // Asal sayı algoritması ?
    public static boolean isPrime(int number) {
        boolean result = false;
        if (number < 0) {
            System.out.println("Asal sayı için Sıfırdan Küçük sayı giremezsiniz");
        } else if (number == 2)
            System.out.println("En küçük asal çift sayıdır");
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    result = true;
            }
            if (result) {
                System.out.println(number + " Asal sayı değildir");
            } else {
                System.out.println(number + " Asal sayıdır");
            }
        }
        return result;
    }

    // Fibanocci sayısını ?
    public Long isFibonacci(int number){
        if(number==1 || number==2)
            return 1L;
        else {
            int previos=1, next=1, sumData=0;
            for (int i = 2; i <number ; i++) {
                sumData=previos+next;
                previos=next;
                next=sumData;
            }
        }
        return null;
    }

    public static int fibonacciRecursive(int number){
        if(number<2)
            return number;
        else{
            return fibonacciRecursive(number-2)+fibonacciRecursive(number-1);
        }
    }

    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nFibonacci için sayı giriniz");
            int number = scanner.nextInt();
            for (int i = 1; i <number; i++) {
                System.out.print(fibonacciRecursive(i)+" ");
            }
        }
    }

    // decoder encoder ?
}