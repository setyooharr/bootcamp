package com.logic01;

import java.util.Scanner;

public class array2D {

    public static void Print() {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int inputNumber = input.nextInt();
        int[][] result = new int[2][inputNumber];

        //soal 01
        System.out.println("SOAL NOMOR 1");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < inputNumber; j++) {
                if (i == 0) {
                    result[i][j] = j;
                } else {
                    result[i][j] = (int) Math.pow(3, j);
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < inputNumber; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        //soal no 2

        System.out.println("SOAL NO 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < inputNumber; j++) {
                if (i == 0) {
                    result[i][j] = j;
                } else if ((j + 1) % 3 == 0) {
                    result[i][j] = (int) Math.pow(3, j) * -1;
                } else {
                    result[i][j] = (int) Math.pow(3, j);
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < inputNumber; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // nomer 04

        System.out.println(" SOAL NOMOR 04 ");
        int keluar1 = 1 , keluar2 = 5 ;

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < inputNumber; j++)
            {
                if (i == 0)
                {
                    result[i][j] = j;
                }
                else if (j % 2 == 0)
                {
                    result[i][j] = keluar1;
                    keluar1 += 1;
                }
                else if (j % 2 == 1 )
                {
                    result[i][j] = keluar2;
                    keluar2 += 5;
                }
            }

        }

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < inputNumber; j++)
            {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        //nomor 03
        System.out.println("SOAL NOMOR 3");
        int number = 2;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < inputNumber ; j++)
            {
                if (i == 0)
                {
                    result[i][j] = j;
                }
                else
                {
                    if (j == 0)
                    {
                        result[i][j] = number;
                        result[i][inputNumber - 1 - j] = number;

                        number *= 3;
                    }
                    else
                    {
                        if (inputNumber % 2 == 0 && j < inputNumber/2)
                        {
                            result[i][j] = number;
                            result[i][inputNumber - 1 - j] = number;

                            number *= 2;
                        }
                        else if (inputNumber % 2 != 0 && j <= inputNumber/2)
                        {
                            result[i][j] = number;
                            result[i][inputNumber - 1 - j] = number;

                            number *= 2;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < inputNumber; j++)
            {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();



    }
}

