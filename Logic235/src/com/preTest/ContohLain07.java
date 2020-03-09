package com.preTest;

import java.util.Scanner;

public class ContohLain07 {
    public static void Print() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your amount of fruits in baskets");
        String fruitBasket = scan.nextLine();

        int[] intArray = Utility.ConvertToIntArray(fruitBasket); //ngambil dari utilitu
        int[] intArrayplus1 = new int[intArray.length + 1];

        for (int i = 0; i < intArray.length; i++) {
            intArrayplus1[i + 1] = intArray[i];
        }

        System.out.println("Select the basket do you want to bring to market : (from 0)");
        int market = scan.nextInt();

        while (market > intArray.length || market < 1) {
            System.out.println("Wrong input, try again");
            market = scan.nextInt();
        }

        int sum = 0;

        for (int i = 1; i < intArrayplus1.length; i++) {
            if (i == market) {
                continue;
            }
            else {
                sum += intArrayplus1[i];
            }
        }

        System.out.println("Total Fruits remaining : " + sum);

    }
}
