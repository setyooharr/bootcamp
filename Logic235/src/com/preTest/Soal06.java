package com.preTest;

import java.util.Scanner;

public class Soal06 {
    public static void Print06() {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Player Main Duluan       2. Computer Main Duluan");
        System.out.print("Masukkan Yang Main Duluan : ");
        int inputCase = input.nextInt();

        switch (inputCase) { // yang di masukkan
            case 1:
                Scanner inputNumber = new Scanner(System.in);//bikin scanner baru
                System.out.print("Input angka Player : ");
                int angkaPlayer = inputNumber.nextInt();

                int computer = (int) (Math.random() * 10);// untuk me random angka 1-10

                if (angkaPlayer < computer) {
                    System.out.println("Computer Menang");
                } else if (angkaPlayer > computer) {
                    System.out.println("Player Menang");
                } else {
                    System.out.println("Draw");
                }
                break;

            case 2:
                int computerCase2 = (int) (Math.random() * 10);

                Scanner inputNumberCase2 = new Scanner(System.in);
                System.out.print("Input angka Player : ");
                int angkaPlayerCase2 = inputNumberCase2.nextInt();

                if (angkaPlayerCase2 < computerCase2) {
                    System.out.println("Computer Menang");
                } else if (angkaPlayerCase2 > computerCase2) {
                    System.out.println("Player Menang");
                } else {
                    System.out.println("Draw");
                }
                break;
        }
    }
}
