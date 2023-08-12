package com.hamitmizrak._01_JavaSE;

import java.io.*;
import java.util.Scanner;

// FILE
// Thread
// Generics
// COLLECTION (List-set-map)
// OOP GİRİŞ, inheritance, abstract, interface
// Java 8 gelen özellikler

public class _24_Threading extends Thread{
 @Override
 public void run() {
  for (int i = 1; i <=5; i++) {
   try {
    System.out.println(i);
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    throw new RuntimeException(e);
   }
  }
 }

 public static void main(String[] args) throws InterruptedException {
  _24_Threading threadingA=new _24_Threading();
  _24_Threading threadingB=new _24_Threading();
  _24_Threading threadingC=new _24_Threading();

  System.out.println("isAlive: "+threadingA.isAlive());
  threadingA.start();
  System.out.println("ID: "+threadingA.getId());
  System.out.println("getName: "+threadingA.getName());
  System.out.println("isAlive: "+threadingA.isAlive());
  System.out.println("hashCode: "+threadingA.hashCode());

  threadingA.join();
  threadingB.start();
  threadingC.start();
 }
}

 class _24_Threading2 implements Runnable{
  @Override
  public void run() {
   for (int i = 1; i <=5; i++) {
    try {
     System.out.println(i);
     Thread.sleep(1000);
    } catch (InterruptedException e) {
     throw new RuntimeException(e);
    }
   }
  }
  // PSVM
  public static void main(String[] args) {
  }
 }

 class _24_Threading3 {
  public static void main(String[] args) {
   Thread thread=new Thread(new Runnable() {
    @Override
    public void run() {
     for (int i = 1; i <=5; i++) {
      try {
       System.out.println(i);
       Thread.sleep(1000);
      } catch (InterruptedException e) {
       throw new RuntimeException(e);
      }
     }
    }
   });
  }
}
