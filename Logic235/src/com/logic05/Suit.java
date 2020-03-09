package com.logic05;

import java.util.Scanner;

public class Suit {
    public static void Print06(){

        int hasil1 = 0;
        int hasil2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jumlah ronde : ");
        int ronde = input.nextInt();
        input.nextLine();

        System.out.println("Pilihan Pemain 1 : ");
        String pemain1 = input.nextLine();
        char[] charArray = pemain1.toCharArray(); // di pisah per huruf

        System.out.println("Pilihan Pemain 2 : ");
        String pemain2 = input.nextLine();
        char[] charArray2 = pemain2.toCharArray();

        for (int i = 0; i < ronde ; i++) { // perulangan jumlah ronde
            if (charArray[i] == charArray2[i]){
                hasil1=0;
                hasil2=0;
            }
        }

        for (int i = 0; i < ronde ; i++)
        {
            if (    charArray[i] == 'B' && charArray2[i] == 'G' ||
                    charArray[i] == 'G' && charArray2[i] == 'K' ||
                    charArray[i] == 'K' && charArray2[i] == 'B' )
           {
               hasil1++;
           }
           else if (charArray2[i] == 'B' && charArray[i] == 'G' ||
                    charArray2[i] == 'G' && charArray[i] == 'K' ||
                    charArray2[i] == 'K' && charArray[i] == 'B')
           {
               hasil2++;
           }
        }

        System.out.println("poin pemain 1 : " +hasil1);
        System.out.println("poin pemain 2 : " +hasil2);

        if (hasil1 > hasil2){
            System.out.println("Pemain 1 menang");
        }
        else if (hasil1 < hasil2){
            System.out.println("Pemain 2 menang");
        }
        else {
            System.out.println("Hasil imbang");
        }
    }
}

//soal no 6
// input
//ronde = 3
//pemain a = ggb
//pemain b = bgk
//
//output = b menang