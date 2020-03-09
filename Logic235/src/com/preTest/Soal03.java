package com.preTest;

import java.util.Scanner;

public class Soal03 {
    public static void Print03() {

        String botol = "botol", gelas = "gelas", teko = "teko", cangkir = "cangkir"; // inputan yang harus di input
        int output = 0;

        //2 scanner ??
        Scanner input = new Scanner(System.in);
        Scanner outputA =new Scanner(System.in);

        System.out.print("Masukkan banyak : ");
        int inputNumber = input.nextInt();
        System.out.print("Masukkan besaran yang ingin diubah : ");
        String inputString = outputA.nextLine();

        //alasan kenapa ini ga ditaroh di bawah ?
        System.out.print("Besaran Keluaran :");
        String konversi = outputA.nextLine();

        if (inputString.equals(botol) && konversi.equals(gelas)) // 2 kondisi sekaligus tergantung apa yang di pilih
        {
            output = inputNumber * 2; // 2 dari inputan
        }

        if (inputString.equals(botol) && konversi.equals(cangkir))
        {
            output = inputNumber * 5;
        }

        if (inputString.equals(teko) && konversi.equals(cangkir))
        {
            output = inputNumber * 25;
        }

        if (inputString.equals(teko) && konversi.equals(gelas))
        {
            output = inputNumber * 10;
        }

        if (inputString.equals(gelas) && konversi.equals(cangkir))
        {
            output = (int) (inputNumber * 2.5);
        }

        System.out.println(output + " " + konversi);
    }
}
