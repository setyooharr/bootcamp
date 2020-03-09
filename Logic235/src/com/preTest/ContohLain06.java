package com.preTest;

import java.util.Random;
import java.util.Scanner;

public class ContohLain06 {
    public static void Print() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(); //sistem random

        System.out.println("Input your choice :");
        System.out.println(" 1. You first \n 2. Computer first");
        int choice = scan.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Input your number : ");
                int inputPlayer = scan.nextInt();

                while (inputPlayer < 0 || inputPlayer > 9) { // di pakai untuk mengecek angka yang di inputkan
                    System.out.println("Input error, try again");
                    inputPlayer = scan.nextInt();
                }

                int inputCom = rand.nextInt(9);//waktu dimana com memasukkan angka secara random
                System.out.println("Player input : " + inputPlayer);
                System.out.println("Computer input : " + inputCom);
                if (inputPlayer > inputCom) {
                    System.out.println("You win !");
                }
                else if (inputPlayer < inputCom){
                    System.out.println("You lose");
                }
                else {
                    System.out.println("draw");
                }
                break;

            case 2:
                inputCom = rand.nextInt(9);
                System.out.println("Com has inputted number, your turn");

                System.out.println("Input your number : ");
                inputPlayer = scan.nextInt();

                while (inputPlayer < 0 || inputPlayer > 9) {
                    System.out.println("Input error, try again");
                    inputPlayer = scan.nextInt();
                }


                System.out.println("Player input : " + inputPlayer);
                System.out.println("Computer input : " + inputCom);
                if (inputPlayer > inputCom) {
                    System.out.println("You win !");
                }
                else if (inputPlayer < inputCom){
                    System.out.println("You lose");
                }
                else {
                    System.out.println("draw");
                }
                break;

            default:
                System.out.println("input error");
                break;
        }
    }
}

