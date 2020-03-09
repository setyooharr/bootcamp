package com.preTest;

import java.util.Scanner;

public class ContohLain04 {
    public static void Print() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your saldo OVO : ");
        int input = scan.nextInt();

        int hargaKopi = 18000;
        int coffeeGet;
        int change;

        coffeeGet = input / 18000;


        int disc = (int) (input * 0.5); // kapan kita menambahkan (int)??

        if (disc > 100000) {
            System.out.println("No coffee for today");
        }
        else {
            int coffeeGot = input >= 40000  && coffeeGet > 2 ? (int) (input / (hargaKopi * 0.5)) : coffeeGet;// fungsi ?   ?
            int price = coffeeGot * hargaKopi;
            int cashBack = (int) (0.1 * price);
        }



//        if(disc > 100000) {
//            System.out.println("No coffee for today");
//        }
//        else {
//            int priceDisc = price - disc;
//            int coffeeGot = input / priceDisc;
//
//            int cashback = (int) (0.1 * priceDisc);
//
//            if(cashback > 30000){
//                cashback = 30000;
//            }
//
//            change = input - priceDisc + cashback;
//            System.out.println("You get : " + coffeeGot);
//            System.out.println("Change : " + change);
//        }


    }
}
