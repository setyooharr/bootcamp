package com.logic03;

import java.util.Scanner;

public class Soal02 {
    public static void Print02() {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga makanan : ");
        int makanan = input.nextInt();
        System.out.println("Masukkan Jarak");
        int jarak = input.nextInt();
        int jarakyYangDiBayar = 0;

        int diskon = 0;
        int totalDiskon = 0;

        double totalSemua = 0;

        double pajak = .1;
        double pajakYangDiBayar = 0;

        if (jarak > 5){
            jarakyYangDiBayar = ((jarak - 5) * 2000);
        }
        else {
            jarakyYangDiBayar = 0;
        }
        System.out.println();

        if (makanan > 30000){
            if (makanan / 2 == 20000 && makanan > 30000){ // 20rb dari 50%
                diskon = (makanan / 2);
                totalDiskon = makanan - diskon;
            }
            else {
                diskon = 20000;
                totalDiskon = makanan - diskon;
            }
        }
        else {
            diskon = 0;
            totalDiskon = makanan - diskon;
        }

        pajakYangDiBayar = makanan * pajak;

        totalSemua = jarakyYangDiBayar + (totalDiskon + pajakYangDiBayar);

        System.out.print("Biaya jarak : " +jarakyYangDiBayar);
        System.out.println();
        System.out.print("harga yang di dapat : " +totalDiskon);
        System.out.println();
        System.out.print("Biaya pajak : " +pajakYangDiBayar);
        System.out.println();
        System.out.println("---------------");
        System.out.print("Total keseluruhan : " +totalSemua);

    }
}

//    public static void Print02() {
//        System.out.println("Soal 02");
//        Scanner input = new Scanner(System.in);
//        int harga, jarak, total, diskon = 0, ongkir = 0;
//        System.out.println("Masukkan harga makanan : ");
//        harga = input.nextInt();
//        System.out.println("Masukkan jarak KM: ");
//        jarak = input.nextInt();
//
//        if (jarak <= 5)
//        {
//            ongkir = 0;
//        }
//        else if (jarak > 5)
//        {
//            ongkir = (jarak - 5) * 2000;
//        }
//
//        if (harga > 30000)
//        {
//            diskon = (int) (harga * 0.5);
//        }
//        if (diskon >= 20000)
//        {
//            total = (int) ((harga - 20000) + (harga * 0.1) + ongkir);
//            System.out.println("Harga total pembayaran :" + total);
//        }
//        else
//        {
//            total = (int) ((harga + ongkir) + (harga * 0.1));
//            System.out.println("Harga total pembayaran :" + total);
//        }
//    }
//}
