package com.hamitmizrak._01_WhatIsJava;

import java.util.Random;
import java.util.Scanner;

public class _06_Random {
    public static void main(String[] args) {
        System.out.println(Math.floor(Math.random()*9+1) );

        Random random=new Random();
        int number=random.nextInt(9)+1;
        System.out.println(number);

        // Class(Random) ile Math(Random) farkı ?
    }
}
