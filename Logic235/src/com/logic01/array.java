package com.logic01;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        //Sequences.Print();
        String answer = "Y";
        Scanner inputObject = new Scanner(System.in);

        while (answer.toUpperCase().equals("Y")){
            System.out.println(" Enter the case number : ");
            int inputCase = inputObject.nextInt();

            switch (inputCase){

                case 1:
                    Sequences.Print();
                    break;

                case 2:
                    array2D.Print();
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
