package com.hamitmizrak._01_JavaSE;

// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

import java.util.ArrayList;
import java.util.List;

public class _27_CollectionsSet {

    public static void main(String[] args) {
        //List<Integer> listem=new LinkedList<>(); // araya yerleştirme , silme
        List<Integer> listem=new ArrayList<>(); // ekleme ve arama
        listem.add(10);
        listem.add(20);
        listem.add(30);
        listem.add(5);

       /* System.out.println(listem.size());
        System.out.println(listem.get(0));
        System.out.println(listem.get(listem.size()-1));
        System.out.println(listem.isEmpty());
        System.out.println(listem.hashCode());*/

        for (int i = 0; i <listem.size() ; i++) {
            System.out.println(listem.get(i));
        }
        listem.remove(0);

        System.out.println("*******************");
        for ( Integer temp  :listem) {
            System.out.println(temp);
        }
    }

}
