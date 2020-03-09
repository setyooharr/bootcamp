package com.preTest;

import java.util.Scanner;

public class ContohLain08 {
    public static void Print() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your pin : ");
        int inputPin = scan.nextInt();

        while(inputPin != 123456) {
            System.out.println("Your pin is false, try again");
            inputPin = scan.nextInt();
        }

        System.out.println("Store your money");
        int inputAmount = scan.nextInt();

        System.out.println("Select your choice : \n 1. Same Bank \n 2. Different Bank");
        int inputChoice = scan.nextInt();

        switch (inputChoice) {
            case 1:
                System.out.println("Insert your rekening : ");
                long rekening = scan.nextLong();

                int countRekening = 0;
                do {
                    rekening /= 10;
                    countRekening++;
                } while (rekening != 0);

                while (countRekening != 10) {
                    countRekening = 0;
                    System.out.println("Rekening is not 10 digit, try again");
                    rekening = scan.nextLong();
                    do {
                        rekening /= 10;
                        countRekening++;
                    } while (rekening != 0);
                }

                System.out.println("Insert amount transfer : ");
                int transfer = scan.nextInt();

                while (transfer > inputAmount) {
                    System.out.println("Transfer is bigger than your amount, try again");
                    transfer = scan.nextInt();
                }

                int lastAmount = inputAmount - transfer;
                System.out.println("your transfer sucess, your amount " + "Rp. " + lastAmount + " ,-");
                break;

            case 2:
                System.out.println("Insert the Bank code");
                int code = scan.nextInt();

                System.out.println("Insert your rekening : ");
                rekening = scan.nextLong();

                countRekening = 0;
                do {
                    rekening /= 10;
                    countRekening++;
                } while (rekening != 0);

                while (countRekening != 10) {
                    System.out.println("Rekening is not 10 digit, try again");
                    countRekening = 0;
                    rekening = scan.nextLong();
                    do {
                        rekening /= 10;
                        countRekening++;
                    } while (rekening != 0);
                }

                System.out.println("Insert amount transfer : ");
                transfer = scan.nextInt();

                while (transfer > inputAmount) {
                    System.out.println("Transfer is bigger than your amount, try again");
                    transfer = scan.nextInt();
                }

                lastAmount = inputAmount - transfer - 7500;
                System.out.println("your transfer sucess, your amount " + "Rp. " + lastAmount + " ,-");
                break;

            default :
                System.out.println("Error");
                break;
        }
    }

}
