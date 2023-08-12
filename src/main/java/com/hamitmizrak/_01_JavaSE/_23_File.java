package com.hamitmizrak._01_JavaSE;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.util.Scanner;

// FILE
// Thread
// Generics
// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

public class _23_File {
    public static final String URL = "C:\\io\\ecodation\\eco10.txt";

    private static String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("lütfen birşey yazınız");
        String userData = klavye.nextLine();
        return userData;
    }

    private static void fileWriterUser(String userData) {
        //writer
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(_23_File.URL, true))) {
            bufferedWriter.write(userData + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileReaderUser() {
        //reader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(_23_File.URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append("\n").append(rows);
            }
            String data = stringBuilder.toString();
            System.out.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void allMethod() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSeçiniz.\n1-)Yazma\n2-)Okuma\n3-)Çıkış");
            int chooise = scanner.nextInt();

            switch (chooise) {
                case 1:
                    String user = userData();
                    fileWriterUser(user);
                    break;
                case 2:
                    fileReaderUser();
                    break;
                case 3:
                    System.out.println("Sistemde Çıkış yapılıyor.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lütfen belirtilen aralıkta seçim yapınız");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        allMethod();
    }

}
