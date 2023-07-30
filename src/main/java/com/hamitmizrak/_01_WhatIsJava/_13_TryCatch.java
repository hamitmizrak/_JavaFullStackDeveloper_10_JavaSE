package com.hamitmizrak._01_WhatIsJava;

import java.io.IOException;
import java.util.Date;

public class _13_TryCatch {
    public static void main(String[] args) throws ArithmeticException, _0_HamitMizrak, IOException {
        try {
            int division = 4 / 0;
            System.out.println(division);
        } catch (ArithmeticException arithmeticException) {
            System.err.println(arithmeticException);
        } catch (Exception e) {
            System.err.println(e);
        }finally {
            System.out.println("Database.close");
        }
        System.out.println("son satır");

        //throw new _0_HamitMizrak("BAk111 hata yapıyorsun kendini düzelt");
        throw new ArithmeticException("BAk44 hata yapıyorsun kendini düzelt");

    }
}
