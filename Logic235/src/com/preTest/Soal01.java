package com.preTest;

import java.util.Scanner;

public class Soal01 {
    public static void Print01(){

        int point = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pembelian Pulsa : ");
        int inputNumber = input.nextInt();


        if (inputNumber < 10000)
        {
            point = 0;
        }
        inputNumber -= 10000;
        if (inputNumber <= 30000) {
            point += inputNumber / 1000;
        }
        else{
            inputNumber -= 20000;
            point += 20000 / 1000;
        }
        if (inputNumber > 30000) {
            point += (inputNumber / 1000) * 2;
        }

        System.out.println("point yang anda dapatkan : " + point);
        //Masih kurang tepat
    }
}

