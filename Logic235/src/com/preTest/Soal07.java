package com.preTest;

import java.util.Scanner;

//belom bisa
public class Soal07 {
    public static void Print07() {

        String A = "Keranjang 1";
        String B = "Keranjang 2";
        String C = "Keranjang 3";
        String kosong = "kosong";
        int result = 0;

        Scanner output = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Keranjang 1 : ");
        int inputNumber1 = input.nextInt();
        System.out.print("Masukkan Keranjang 2 : ");
        int inputNumber2 = input.nextInt();
        System.out.print("Masukkan Keranjang 3 :");
        int inputNumber3 = input.nextInt();
        System.out.println("Masukkan Keranjang yang kosong : ");
        String inputKosong = output.nextLine();

        if (inputKosong.toLowerCase().equals("keranjang 1"))
        {
            result = inputNumber2 + inputNumber3;
            System.out.println("Jumlah Buah : " + result);
        }

        if (inputKosong.toLowerCase().equals(B))
        {
            result = inputNumber2 + inputNumber3;
            System.out.println("Jumlah Buah : " + result);
        }

        if (inputKosong.toLowerCase().equals(C))
        {
            result = inputNumber2 + inputNumber3;
            System.out.println("Jumlah Buah : " + result);
        }
    }
}
