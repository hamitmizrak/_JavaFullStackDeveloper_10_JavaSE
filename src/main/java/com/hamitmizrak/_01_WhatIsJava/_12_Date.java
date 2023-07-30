package com.hamitmizrak._01_WhatIsJava;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class _12_Date {
    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(date);
        System.out.println("Haftanın Günleri: "+date.getDay());
        System.out.println("Saat: "+date.getHours());
        System.out.println("Dakika: "+date.getMinutes());
        System.out.println("Saniye: "+date.getSeconds());

        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
        System.out.println("Yıl: "+(date.getYear()+1900));

        date.setMonth(2);
        System.out.println("Ay: "+date.getMonth());
    }
}
