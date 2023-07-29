package com.hamitmizrak._01_WhatIsJava;

public class _08_Conditional {
    public static void main(String[] args) {

        // conditional
        int number=25;
        if(number>50){
            System.out.println("50'den Büyüktür");
        }else{
            System.out.println("50'den Küçüktür");
        }

        // ternary
        String result2=(number>50) ? "50'den Büyüktür" : "50'den Küçüktür";
        System.out.println(result2);

    }
}
