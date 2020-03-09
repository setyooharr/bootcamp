package com.preTest;

import java.util.Scanner;

public class Soal05 {
    public static void Print05() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input for people : ");
        System.out.println("Laki - laki dewasa : LD\tPerempuan dewasa : PD\nRemaja : R\tAnak-anak : A\nBalita : B");

        String input = scan.nextLine();

        String[] inputArray = input.split(",");
        int countPeople = inputArray.length;
        int countPorsi = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].toUpperCase().equals("LD")) {
                countPorsi += 2;
            }

            else if (inputArray[i].toUpperCase().equals("PD")) {
                countPorsi += 1;
                if(countPeople % 2 != 0) {
                    countPorsi++;
                }
            }

            else if(inputArray[i].toUpperCase().equals("R")) {
                int countR = 0;
                for (int j = 0; j < inputArray.length; j++) {
                    if (inputArray[j].toUpperCase().equals("R"))
                        countR++;
                }
                if (countR >= 2 && countR % 2 == 0) {
                    countPorsi = countPorsi + countR;
                }
            }

            else if (inputArray[i].toUpperCase().equals("A")) {
                countPorsi += 0.5;
            }

            else if (inputArray[i].toUpperCase().equals("B")) {
                countPorsi += 1;
            }
        }

        System.out.println("Porsi total : " + countPorsi);
    }
}
