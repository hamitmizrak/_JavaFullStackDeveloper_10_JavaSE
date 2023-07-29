package com.hamitmizrak._01_WhatIsJava;

public class _09_Conditional {
    public static void main(String[] args) {

        // conditional
        int number=3;
        if(number==1){
            System.out.println("sayı 1");
        }else if(number==2){
            System.out.println("sayı 2");
        }else if(number==3){
            System.out.println("sayı 3");
        }else if(number==4){
            System.out.println("sayı 4");
        }else if(number==5){
            System.out.println("sayı 5");
        }else{
            System.out.println("1<=X<=5 dışındadır");
        }
        System.out.println("\n***************");
        // switch case
        switch (number){
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("1<=X<=5 dışındadır");
                break;
        }

    }
}
