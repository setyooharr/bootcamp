package com.logic05;

import java.util.Scanner;

public class TepukGambar {
    public static void Print10() {

        int resultPlayer = 0, resultCPU = 0, tempResultPlayer = 0, tempResultCPU = 0;
        String answer = "YA";

        while (answer.toUpperCase().equals("YA")) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Slot Kartu : ");
            int slotKartu = input.nextInt();

            while (slotKartu > 0) {
                if (slotKartu > 0){
                    resultPlayer = (int) (Math.random() * 4) + 1;
                    resultCPU = (int) (Math.random() * 4) + 1;

                    slotKartu -= resultPlayer + resultCPU;
                    tempResultPlayer += resultPlayer;
                    tempResultCPU += resultCPU;
                }
                else if (slotKartu <= 0) {
                    break;
                }
            }

            if (resultPlayer > resultCPU) {
                System.out.println("Player Menang");
            }
            else if (resultPlayer < resultCPU) {
                System.out.println("Computer Menang");
            }
            else if (resultCPU == resultPlayer) {
                System.out.println("Draw");
            }

            System.out.println();
            System.out.println("Main Lagi ?");

            // for start from beginning
            input.nextLine();
            answer = input.nextLine();
        }
    }
}


//no 10
