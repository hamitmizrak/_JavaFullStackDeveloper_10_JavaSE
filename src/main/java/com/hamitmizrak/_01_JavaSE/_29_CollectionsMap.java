package com.hamitmizrak._01_JavaSE;

// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

import java.util.*;

public class _29_CollectionsMap {

    public static void main(String[] args) {

        // Map<Integer,String> mapList=new HashMap<>();
        // Map<Integer,String> mapList=new LinkedHashMap<>();
        Map<String,String> mapList=new TreeMap<>();
        mapList.put(UUID.randomUUID().toString(),"Ankara");
        mapList.put(UUID.randomUUID().toString(),"MAlatya");
        mapList.put(UUID.randomUUID().toString(),"Sivas");

        for (String key:mapList.keySet()){
            System.out.println(key);
        }
        System.out.println("*********");
        for (String value:mapList.values()){
            System.out.println(value);
        }
        System.out.println("************");
        for (String key:mapList.keySet()){
            System.out.println(key+" => "+mapList.get(key));
        }
        System.out.println("************");
        // Lambda Expression
        mapList.entrySet().forEach((temp)->{
            System.out.println(temp);
        });

        System.out.println("size: "+mapList.size());
    }
}
