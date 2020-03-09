package com.logic00;

import java.util.Scanner;

public class Belajar05 {
    public static int[] fibbonaci(int n) {
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            if (i==0 || i==1)
                arr1[i] = 1;
            else
                arr1[i] = arr1[i-1]+arr1[i-2];
        }
        return arr1;
    }
    public static int[] prima(int n) {
        int[] arr2 = new int[n];
        int set=2 , jum=0;
        int divide=2;
        int i=0;
        while(jum<n) {
            for (int k = 1; k <= set; k++) {
                if (set%k==0) {
                    divide++;
                }
            }

            if (divide==2 || set==2 ) {
                arr2[i]=set;
                set++;
                i++;
                jum++;
                divide=0;
            }
            else {
                set++;
                divide=0;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Deret: ");
        int len = sc.nextInt();
        int[] hasil = new int[len];
        int[] deret1 = prima(len);
        int[] deret2 = fibbonaci(len);
        System.out.print("Deret Prima \t->\t");
        for (int i = 0; i < deret1.length; i++) {
            System.out.print(deret1[i]+" \t");
        }
        System.out.println();
        System.out.print("Deret Fibonacci\t->\t");
        for (int i = 0; i < deret2.length; i++) {
            System.out.print(deret2[i]+" \t");
        }
        System.out.println();
        System.out.print("Deret Jumlah\t->\t");
        for (int i = 0; i < hasil.length; i++) {
            hasil[i] = deret1[i]+deret2[i];
            System.out.print(hasil[i]+" \t");
        }
        System.out.println();

    }
}
