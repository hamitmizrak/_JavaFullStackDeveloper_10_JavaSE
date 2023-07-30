package com.hamitmizrak._01_JavaSE;

public class _07_Cast {
    public static void main(String[] args) {

        float f1=14.56f;
        long l1=151151515155151515L;

        String str="44";
        int newStr=Integer.valueOf(str);
        int newStr2=Integer.parseInt(str);
        System.out.println(str+16);
        System.out.println(newStr+16);
        System.out.println(newStr2+16);

        int number=16;
        String newStr4=String.valueOf(number);
        System.out.println(number+14);
        System.out.println(number+newStr4);

    }
}
