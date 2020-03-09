package com.preTest;

import java.util.Scanner;

public class ContohLain10 {
    public static void Print(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Panjang Deret : ");
        int inputNumberDeret = input.nextInt();
        int[] inputGanjil = new int[inputNumberDeret];
        int[] inputGenap = new int[inputNumberDeret];

        int numberGenap = 0;
        for ( int i = 0; i < inputNumberDeret; i++ )
        {
            inputGenap[i] = numberGenap;
            System.out.print(inputGenap[i] + " ");
            numberGenap += 2;
        }
        System.out.println();

        int numberGanjil = 1;
        for ( int i = 0; i < inputNumberDeret; i++ )
        {
            inputGanjil[i] = numberGanjil;
            System.out.print(inputGanjil[i] + " ");
            numberGanjil += 2;
        }
        System.out.println();

        String[] tambahBilangan = new String[inputNumberDeret];

        for (int i = 0; i < tambahBilangan.length; i++) {
            tambahBilangan[i] = Integer.toString(inputGanjil[i] + inputGenap[i]);
        }

        String jumlah = "";

        for (int i = 0; i < tambahBilangan.length; i++) {
            jumlah += tambahBilangan[i]+" ";
        }
        System.out.println(jumlah);
    }
}

