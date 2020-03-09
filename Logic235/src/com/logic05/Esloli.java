package com.logic05;

import java.util.Scanner;

public class Esloli {
    public static void Print11(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Uang : ");
        int uang = input.nextInt();

        int hargaEsLoli = 2500;
        int jumlahLoli = uang / hargaEsLoli;

        int bonus = 0;

        if (jumlahLoli % 3 <= 1){
            bonus = jumlahLoli / 3 *2;
        }
        else if (jumlahLoli % 3 == 2){
            bonus = jumlahLoli/3*2+1;
        }

        if (jumlahLoli == 2){
            bonus += 1;
        }

        int kembalian = uang - (jumlahLoli*hargaEsLoli);

        int totalEsLoli = jumlahLoli + bonus;

        System.out.println("Es Loli yang di Dapat : " + totalEsLoli);
        System.out.println("kembalian : " +kembalian);
    }
}

//no 11
//es loli
//1 es = 2500
//beli 2 gratis 1
//beli 3 gratis 1
//
//inputan jumlah uang
//output berapa es dan kemabalian