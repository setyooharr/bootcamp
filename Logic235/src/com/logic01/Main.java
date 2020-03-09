package com.logic01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputNumber;
        Scanner input = new Scanner(System.in);

        //nomor 01
        System.out.println("Soal nomor 1");
        int hasil=1;

        System.out.println("Masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber; i++){

            System.out.print(hasil + " ");
            hasil+= 2;

        }
        System.out.println();
        System.out.println();

        //nomor 02

        System.out.println("Soal nomor 2");
        int hasil2=2;

        System.out.println("masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber; i++) {

            System.out.print(hasil2 + " ");
            hasil2+=2;

        }

        System.out.println();
        System.out.println();

        //nomor 4
        System.out.println("Soal nomor 4");
        int hasil4 = 1;

        System.out.println("masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i=0; i < inputNumber; i++){

            System.out.print(hasil4 + " ");
            hasil4+=3;

        }
        System.out.println();
        System.out.println();

        //nomor 05
        System.out.println("Soal nomor 5");
        int hasil5 = 1;

        System.out.println("masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber; i++) {

            if ((i+1) % 3 == 0){

                System.out.print("* ");

            }
            else
                {
                    System.out.print(hasil5 + " ");
                    hasil5+=4;
            }

        }
        System.out.println();
        System.out.println();

        //nomor07
        System.out.println("Soal nomor 7");
        int hasil7=2;

        System.out.println("masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i=0; i < inputNumber; i++){

            System.out.print(hasil7 + " ");
            hasil7*=2;

        }
        System.out.println();
        System.out.println();

        //nomor08
        System.out.println("Soal nomor 8");
        int hasil8 = 3;

        System.out.println("masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber; i++ ){

            System.out.print(hasil8 + " ");
            hasil8*=3;

        }
        System.out.println();
        System.out.println();

        //nomor09
        System.out.println("Soal nomor 9");
        int hasil9 = 4;

        System.out.println("maskkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber; i++){

            if ((i+1) % 3 == 0){

                System.out.print("* ");

            }
            else
            {
                System.out.print(hasil9 + " ");
                hasil9*=4;
            }

        }
        System.out.println();
        System.out.println();


        //nomor06
        System.out.println("soal nomor 6 ");
        int hasil6 = 1;

        System.out.println(" masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber ; i++){
            if ((i+1) % 3 == 0){

                System.out.print("* ");
                hasil6+=4;

            }
            else
            {
                System.out.print(hasil6 + " ");
                hasil6+=4;
            }

        }
        System.out.println();
        System.out.println();

        //nomor10
        System.out.println("soal nomor 10");
        int hasil10 = 3;

        System.out.println(" masukkan angka : ");
        inputNumber = input.nextInt();

        for (int i = 0; i < inputNumber ; i++){
            if ((i+1) % 4 == 0){

                System.out.print("XXX ");
                hasil10*=3;

            }
            else
            {
                System.out.print(hasil10 + " ");
                hasil10*=3;
            }

        }



        //nomor03




    }
}
