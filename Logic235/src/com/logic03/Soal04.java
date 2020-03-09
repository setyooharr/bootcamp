package com.logic03;

import java.util.Scanner;

public class Soal04 {
    public static void Print04(){

        Scanner input = new Scanner(System.in);

        int diagonal1 = 0, diagonal2 = 0,kurang = 0;

        System.out.println(" Perhitungan MATRIX");
        System.out.print("Baris : ");
        int baris = input.nextInt();
        System.out.print("Kolom : ");
        int kolom = input.nextInt();

        int[][] matrix_a = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(String.format("Nilai [%d][%d] : ", i+1, j+1));
                matrix_a[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Keluaran Matrix : ");

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix_a[i][j]);

                if (j < (kolom - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }

                if (i == j) {
                    diagonal1 += matrix_a[i][j];
                }
                if (i == baris - j - 1){
                    diagonal2 += matrix_a[i][j];
                }

            }
            System.out.println();
        }

        System.out.println("Diagonal 1 : " + diagonal1);
        System.out.println("Diagonal 2 : " + diagonal2);
        kurang = diagonal1 - diagonal2;
        System.out.println("Absolut |"+ diagonal1 +" - "+ diagonal2 +"| = " + Math.abs(kurang));
    }
}

