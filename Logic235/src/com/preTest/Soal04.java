package com.preTest;

import java.util.Scanner;

public class Soal04 {
    public static void Print04() {

        int hargakopi = 18000, banyakPembelian = 0, kembalian = 0, sisa = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Saldo OPO : ");
        int inputNumber = input.nextInt();

        hargakopi *= .5;
        double cup = Math.round(inputNumber / hargakopi);
        int totalharga = (int) (hargakopi * cup);

        if (totalharga > 40000)
        {
            if (totalharga < 100000)
            {
                banyakPembelian = totalharga / hargakopi;
                System.out.println("Banyak Kopi : " + banyakPembelian);
                kembalian = inputNumber - (banyakPembelian * hargakopi);
                sisa = (int) (totalharga * .1);
                System.out.println("Saldo Akhir : " + sisa + kembalian);
            }
            else
            {
                System.out.println("Saya tidak jadi beli");
            }
        }

        else
        {
            banyakPembelian = inputNumber / 18000;
            System.out.println("Banyak Kopi : " + banyakPembelian);
            kembalian = inputNumber - (banyakPembelian * 18000);
            sisa = (int) ((banyakPembelian * 18000) * 0.1);
            System.out.println("Saldo Akhir : " + (sisa + kembalian));
        }

    }
}
