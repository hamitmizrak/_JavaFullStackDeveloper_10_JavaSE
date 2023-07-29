package com.hamitmizrak._01_WhatIsJava;

public class _07_String {
    public static void main(String[] args) {

        String vocabulary="java ÖĞreniyorum java ";
        System.out.println(vocabulary.length());
        System.out.println(vocabulary.trim().length());

        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());

        System.out.println(vocabulary.concat("-Sona ekler"));
        System.out.println(vocabulary.contains("ÖĞreniyorum4"));

        System.out.println(vocabulary.substring(5));
        System.out.println(vocabulary.substring(0,2));

        System.out.println(vocabulary.charAt(0));

        System.out.println(vocabulary.startsWith("j"));
        System.out.println(vocabulary.endsWith(" "));
        System.out.println(vocabulary.isEmpty());
        System.out.println(!vocabulary.isEmpty());
        System.out.println(vocabulary.hashCode());
        System.out.println(vocabulary.equals("java ÖĞreniyorum4 java "));

        System.out.println(vocabulary.indexOf("java"));
        System.out.println(vocabulary.lastIndexOf("java"));
    }
}
