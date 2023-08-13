package com.hamitmizrak._03_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamTutorials {

    public static List<String> cities(){
        List<String> city=new ArrayList<>();
        city.add("malatya");
        city.add("zonguldak");
        city.add("elazığ");
        city.add("sivas");
        city.add("malatya");
        city.add("malatya");
        city.add("malatya");
        city.add("malatya");
        city.add("adana");
        return city;
    }

    public static void allMethodData(){
        List<String> city=cities();
        /*for (int i = 0; i <city.size() ; i++) {
            System.out.print(city.get(i)+" ");
        }*/
        /*List<String> newDataList=  city.stream().sorted().collect(Collectors.toList());
        newDataList.stream().forEach(System.out::println);*/

       /* List<String> newDataList=
                city
                        .stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        newDataList.stream().forEach(System.out::println);*/

        /*List<String> newDataList=  city
                .stream()
                .sorted()
                .filter((temp)->"malatya".equals(temp))
                .limit(3)
                .collect(Collectors.toList());
        newDataList.stream().forEach(System.out::println);*/

        /*List<String> newDataList=  city
                .stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        newDataList.stream().forEach(System.out::println);*/

       /* Long newDataList=  city
                .stream()
                .sorted()
                .distinct()
                .count();
        System.out.println(newDataList);*/

        List<String> newDataList=  city
                .stream()
                .sorted()
                .filter((temp)->"malatya".equals(temp))
                .limit(100)
                .map((temp)->temp.concat("INC").toUpperCase())
                .collect(Collectors.toList());
        newDataList.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        allMethodData();
    }

}
