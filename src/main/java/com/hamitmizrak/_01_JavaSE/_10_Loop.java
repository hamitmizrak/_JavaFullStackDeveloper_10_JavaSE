package com.hamitmizrak._01_JavaSE;

public class _10_Loop {
    public static void main(String[] args) {

        // iterative For
        // i++  , i=i+1  , i+=1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // sonsuz döngü for
        //for(;;){}

        System.out.println("\n");
        // while
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        // while sonsuz döngü
        // while(true){}
        System.out.println("\n");

        // while
        int m = 1;
        do {
            System.out.print(m + " ");
            m++;
        }
        while (m <= 10);
    }
}
