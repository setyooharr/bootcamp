package com.logic03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Sequences.Print();
        String answer = "Y";
        Scanner inputObject = new Scanner(System.in);

        while (answer.toUpperCase().equals("Y")){
            System.out.println(" Enter the case number : ");
            int inputCase = inputObject.nextInt();

            switch (inputCase){

                case 1:
                    //Sequences.Print(); //NAMA YANG DI PANGGIL

                    Soal01.Print01();
                    System.out.println();

                    //StringAsterisk.Print02();
                    //System.out.println();

                    //StringAsterisk.Print03();
                    //System.out.println();

                    //StringAsterisk.Print04();
                    //System.out.println();

                    break;

                case 2:
                    Soal02.Print02();
                    System.out.println();
                    break;

                case 3:
                    //Palindrome.PrintPalindrome();
                    //System.out.println();
                    break;

                case 4:
                    //Pangram.PrintPangram();
                    //System.out.println();
                    break;

                case 5:
                    Soal05.Print05();
                    System.out.println();
                    break;

                default:
                    System.out.println(" No case was found");
                    break;
            }

            System.out.println();
            System.out.println("Continie ? ");

            inputObject.nextLine();
            answer = inputObject.nextLine();
        }
    }
}
