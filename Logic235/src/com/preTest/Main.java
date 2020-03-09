package com.preTest;

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
                        Soal01.Print01();
                        System.out.println();
                        break;

                    case 2:
                        Soal02.Print02();
                        System.out.println();
                        break;

                    case 3:
                        Soal03.Print03();
                        System.out.println();
                        break;

                    case 4:
                        Soal04.Print04();
                        System.out.println();
                        break;

                    case 5:
                        Soal05.Print05();
                        System.out.println();
                        break;

                    case 6:
                        Soal06.Print06();
                        System.out.println();
                        break;

                    case 7:
                        Soal07.Print07();
                        System.out.println();
                        break;

                    case 8:
                        Soal08.Print08();
                        System.out.println();
                        break;

//                    case 9:
//                        Scanner scan = new Scanner(System.in);
//
//                        System.out.println("Masukkan jumlah kartu :");
//                        int input = scan.nextInt();
//                        Nomer6.Resolve(input);
//                        break;

                    case 10:
                        Soal10.Print10();
                        System.out.println();
                        break;

                    case 11:
                        ContohLain01.Print();
                        System.out.println();
                        break;

                    case 12:
                        ContohLain03.Print();
                        System.out.println();
                        break;

                    case 13:
                        ContohLain04.Print();
                        System.out.println();
                        break;

                    case 14:
                        ContohLain06.Print();
                        System.out.println();
                        break;

                    case 15:
                        ContohLain07.Print();
                        System.out.println();
                        break;

                    case 16:
                        ContohLain08.Print();
                        System.out.println();
                        break;

                    case 17:
                        ContohLain10.Print();
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

