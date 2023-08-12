package com.hamitmizrak._01_JavaSE;

// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

import java.util.*;

public class _28_CollectionsSet {

    public static void main(String[] args) {

        //Set<Integer> listem=new LinkedHashSet<>(); // eklediğiniz sırada
        //Set<Integer> listem=new TreeSet<>(); // küçükten büyüğe doğru
        Set<Integer> listem=new TreeSet<>(); // kafasına ekler
        listem.add(10);
        listem.add(20);
        listem.add(30);
        listem.add(30);
        listem.add(30);
        listem.add(5);

       /* System.out.println(listem.size());
        System.out.println(listem.get(listem.size()-1));
        System.out.println(listem.isEmpty());
        System.out.println(listem.hashCode());*/


        System.out.println("*******************");
        for ( Integer temp  :listem) {
            System.out.println(temp);
        }
    }

}
