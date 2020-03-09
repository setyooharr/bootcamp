package com.logic02;

import java.util.Scanner;

public class Sos {
    public static void PrintSos()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("MASUKAN KATA : ");
        String inputString = input.nextLine();

        String charSos = "SOS";
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.toUpperCase().charAt(i) == charSos.charAt(0) &&
                inputString.toUpperCase().charAt(i + 1) == charSos.charAt(1) &&
                inputString.toUpperCase().charAt(i + 2) == charSos.charAt(2))
            {
                count++;
            }

        }
        System.out.print("Jumlah : " +count);



    }
}
