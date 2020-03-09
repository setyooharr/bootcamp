package com.logic05;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Sequences.Print();
        String answer = "Y";
        Scanner inputObject = new Scanner(System.in);

        while (answer.toUpperCase().equals("Y")){
            System.out.println("Enter the case number : ");
            int inputCase = inputObject.nextInt();

            switch (inputCase){

                case 1:
                    NaikGunung.Print01();
                    System.out.println();
                    break;

                case 2:
                    PrimeNumber.Print02();
                    System.out.println();
                    break;

                case 3:
                    Lilin.Print03();
                    System.out.println();
                    break;

                case 4:
//                    Soal11.Print11();
//                    System.out.println();
//                    break;

                case 5:
                    Pustaka.Print05();
                    System.out.println();
                    break;

                case 6:
                    Suit.Print06();
                    System.out.println();
                    break;

                case 7:
                    TinggiHuruf.Print07();
                    System.out.println();
                    break;

                case 8:
                    NilaiMurid.Print08();
                    System.out.println();
                    break;

                case 9:
                    Kendaraan.Print09();
                    System.out.println();
                    break;

                case 10:
                    TepukGambar.Print10();
                    System.out.println();
                    break;

                case 11:
                    Esloli.Print11();
                    System.out.println();
                    break;

                default:
                    System.out.println("No case was found");
                    break;
            }

            System.out.println();
            System.out.println("Continue ? ");

            inputObject.nextLine();
            answer = inputObject.nextLine();
        }
    }
}