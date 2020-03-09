package com.logic04;


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
                    inputObject.nextLine();

                    System.out.println("Masukkan angka : ");
                    String textNumber = inputObject.nextLine();

                    NumberArray.PrintSort(textNumber);
                    System.out.println();

                    NumberArray.PrintMean(textNumber);
                    System.out.println();

                    NumberArray.PrintMedian(textNumber);
                    System.out.println();

                    NumberArray.PrintMinMax(textNumber);
                    System.out.println();
                    break;

                case 2:

                    inputObject.nextLine();
                    System.out.println("Masukkan angka : ");
                    String text = inputObject.nextLine();

                    Soal03.Print03(text);
                    System.out.println();
                    break;

                case 3:

                    Soal10.Print10();
                    System.out.println();
                    break;

                case 4:

                    Soal11.Print11();
                    System.out.println();
                    break;

                case 5:

                    Soal09.Print09();
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
