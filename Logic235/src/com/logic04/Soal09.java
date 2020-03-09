package com.logic04;

import java.util.Scanner;

public class Soal09 {

    public static void Print09(){

        Scanner inputObject = new Scanner(System.in);

        System.out.println("Input String : ");
        String stringRemove = inputObject.nextLine();

        System.out.println("Input String Yang Akan Di Hapus : ");
        String stringRemoveTarget = inputObject.nextLine();

        System.out.println("String Output = "+stringRemove.replace(stringRemoveTarget.toLowerCase(), ""));
    }
}
