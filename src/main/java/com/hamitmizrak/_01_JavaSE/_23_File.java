package com.hamitmizrak._01_JavaSE;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.Scanner;

// FILE
// Thread
// COLLECTION
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

public class _23_File {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("lütfen birşey yazınız");
        String userData=klavye.nextLine();

        //writer
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\io\\ecodation\\eco10.txt",true))) {
            bufferedWriter.write(userData+"\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //reader
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\io\\ecodation\\eco10.txt"))) {
           StringBuilder stringBuilder=new StringBuilder();
           String rows="";
           while((rows=bufferedReader.readLine())!=null){
               stringBuilder.append("\n").append(rows);
           }
           String data=stringBuilder.toString();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
