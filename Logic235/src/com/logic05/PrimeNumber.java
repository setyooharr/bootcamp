package com.logic05;

import java.util.Scanner;

public class PrimeNumber {
    public static void Print02(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah bilangan : ");
        int jumlahBilangan = input.nextInt();


        int hitung =0;
        int angka = 2;

        while (hitung < jumlahBilangan){
            boolean prima = true;

            for (int i = 2; i <= angka / 2 ; i++) {
                if (angka % i == 0){
                    prima = false;
                    break;
                }
            }

            if (prima){
                hitung++;
                System.out.print(angka + " ");
            }
            angka++;
        }
    }
}
// soal no 2 bilangan prima
// input n = 7
// out = 2 3 5 7 11 13 17