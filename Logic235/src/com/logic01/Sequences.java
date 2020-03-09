package com.logic01;

import java.util.Scanner;

public class Sequences {

    public static void Print(){
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukkan angka : ");
        int inputNumber = input.nextInt();
        int[] result = new int[inputNumber]; //array

        //soal 01
        System.out.println("SOAL NO 1");

        int hasil1 = 1;
        for (int i = 0; i < inputNumber; i++){

            result[i] = hasil1;
            System.out.print(result[i] + " ");
            hasil1 += 2;

        }
        System.out.println();
        System.out.println();

        //soal02
        System.out.println("SOAL NO 2");

        int hasil2 = 2;
        for (int i = 0; i < inputNumber; i++){

            result[i] = hasil2;
            System.out.print(result[i] + " ");
            hasil2 += 2;
        }
        System.out.println();
        System.out.println();

        //soal no 4
        System.out.println("SOAL NO 4 ");

        int hasil4 = 1;
        for (int i = 0; i < inputNumber; i++){

            result[i] = hasil4;
            System.out.print(result[i] + " ");
            hasil4+=3;
        }
        System.out.println();
        System.out.println();

        //soal 03 fibonacci

        System.out.println("SOAL NO 3");

        //int hasil3 = 1;
        for (int i = 0; i < inputNumber; i++){

            if (i <= 1){
                result[i] = 1;

            }
            else{
                result[i] = result[i - 1] + result[i - 2];
            }
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println();

        //soal 011

        System.out.println("SOAL NO 11"); //fibonacci

        //int hasil11 = 1;
        for (int i = 0; i < inputNumber; i++){

            if (i <= 2){
                result[i] = 1;

            }
            else{
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
            System.out.print(result[i] + " ");
        }

    }
}

