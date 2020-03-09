package com.preTest;

import java.util.Scanner;

public class Soal08 {

    static final int PIN = 123456;

    public static void Print08(){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan PIN : ");
        int inputPIN = input.nextInt();

        if (inputPIN != PIN)
        {
            System.out.println("PIN Salah");
        }
        else {
            System.out.print("Masukkan Uang yang diSetor : ");
            int saldo = input.nextInt();

            System.out.println("Pilih Transfer :        1. Antar Rekening           2. Antar Bank");
            int inputCase = input.nextInt();

            switch (inputCase) {
                case 1:
                    System.out.print("Masukkan Rekening Tujuan : ");
                    int rekeningTujuan = input.nextInt();
                    System.out.print("Masukkan Nominal yang ditransfer :");
                    int nominal = input.nextInt();

                    if (saldo < nominal)
                    {
                        System.out.println("Saldo tidak mencukupi");
                    }
                    else
                    {
                        saldo -= nominal;
                        System.out.println("Sisa Saldo anda : " + saldo);
                    }
                    break;

                case 2:
                    System.out.print("Masukkan Kode Bank : ");
                    int kodeBank = input.nextInt();
                    System.out.print("Masukkan Rekening Tujuan : ");
                    int rekeningTujuanCase2 = input.nextInt();
                    System.out.print("Masukkan Nominal yang ditransfer :");
                    int nominalCase2 = input.nextInt();

                    if (saldo < nominalCase2)
                    {
                        System.out.println("Saldo tidak mencukupi");
                    }
                    else
                    {
                        saldo -= (nominalCase2 + 7500);
                        System.out.println("Sisa Saldo anda : " + saldo);
                    }
            }
        }
    }
}
