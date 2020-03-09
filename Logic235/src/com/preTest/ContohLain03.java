package com.preTest;

import java.util.Scanner;

public class ContohLain03 {
    public static void Print() {
        Scanner scan = new Scanner(System.in);

        // botol, gelas, teko, cangkir

        System.out.println("Select conversion");
        System.out.println("1. botol \t 3. gelas \n2. teko \t 4. cangkir ");


        int input = scan.nextInt();

        double botol, teko, gelas, cangkir;

        System.out.println("Select amount to convert : ");
        int converInput = scan.nextInt();

        switch (input) {
            case 1:
                teko = converInput * 0.2;
                gelas = converInput * 2;
                cangkir = converInput * 5;
                System.out.println(converInput + " botol : " + teko +" teko, " + gelas + "gelas, " + cangkir + " cangkir");
                break;

            case 2:
                botol = converInput * 5.0;
                gelas = converInput * 10.0;
                cangkir = converInput * 25.0;
                System.out.println(converInput + " teko : " + botol + " botol, " + gelas + " gelas, " + cangkir + " cangkir");
                break;

            case 3:
                botol = converInput * 0.5;
                teko = converInput / 10.0;
                cangkir = converInput * 2.5;
                System.out.println(converInput + " gelas : " + botol + " botol, " + teko + " teko, " + cangkir + " cangkir");
                break;

            case 4:
                teko = converInput / 25.0;
                botol = converInput / 5.0;
                gelas = converInput / 2.5;
                System.out.println(converInput + " cangkir : " + teko + " teko, " + botol + " botol, " + gelas + " gelas ");
                break;

            default:
                System.out.println("No input");
                break;
        }
    }
}
