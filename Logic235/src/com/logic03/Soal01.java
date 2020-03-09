package com.logic03;

import java.util.Scanner;

public class Soal01 {
    //array 2D
    public static void Print01 (){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang : ");
        int jumlahUang = input.nextInt();

        int[] baju = {21 , 33 , 39}; // inputan integer berupa array
        int[] kacamata = {24 , 36 , 44}; // inputan integer berupa array

        int jumlahHarga = 0;
        int jumlahMaksimal = 0;

        for (int i = 0; i < baju.length ; i++) {
            for (int j = 0; j < kacamata.length ; j++) {

                jumlahHarga = baju[i] + kacamata[j];
                if (jumlahMaksimal < jumlahHarga && jumlahHarga < jumlahUang){
                    jumlahMaksimal = jumlahHarga;
                }
            }
        }

        int kembali = jumlahUang - jumlahMaksimal;

        System.out.println("---");
        System.out.println("Total biaya yang di keluarkan : " +jumlahMaksimal);
        System.out.println();
        System.out.println("Kembalian : " +kembali);
    }
}
