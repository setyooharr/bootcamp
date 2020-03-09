package com.logic04;

import java.util.Scanner;

public class Soal11 {

    static final int up = 100;
    static final int down = 100;

    public static void Print11() {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Kedalaman : ");
        int inputNumber = input.nextInt();

        System.out.print("Masukkan Kode : ");
        input.nextLine();
        String inputKode = input.nextLine();

        char[] charArray = inputKode.toCharArray();

        for (int i = 0; i < inputKode.length(); i++) {
            if (charArray[i] == 'U') {
                inputNumber -= up;
            }
            else if (charArray[i] == 'D') {
                inputNumber += down;
            }

            if (inputNumber < 0)
            {
                inputNumber = 0;
            }
        }

        System.out.println("Kedalaman Akhir : " + inputNumber + " M");
    }
}

