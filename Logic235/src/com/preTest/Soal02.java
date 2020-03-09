package com.preTest;

import java.util.Scanner;

public class Soal02 {
    public static void Print02() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your route : ");
        String route = scan.nextLine(); // MULAI MEMBACA RUTE (BERDASARKAN INPUTAN)
        String[] routeArray = route.split(","); // MEMISAHKAN "," BERDASARKAN INPUTAN DAN MEMISAHKAN PER KATA
        float distance = 0; // KM

        for (int i = 1; i < routeArray.length; i++) {
            if (routeArray[i - 1].toUpperCase().equals("TOKO")) {
                if (routeArray[i].toUpperCase().equals("TEMPAT1")) {
                    distance += 2.0;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT2")) {
                    distance += 2.5;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT3")) {
                    distance += 4.0;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT4")) {
                    distance += 6.5;
                }
            }

            else if (routeArray[i - 1].toUpperCase().equals("TEMPAT1")) {
                if (routeArray[i].toUpperCase().equals("TEMPAT2")) {
                    distance += 0.5;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT3")) {
                    distance += 2.0;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT4")) {
                    distance += 4.5;
                } else if (routeArray[i].toUpperCase().equals("TOKO")) {
                    distance += 2.0;
                    break;
                }
            }

            else if (routeArray[i - 1].toUpperCase().equals("TEMPAT2")) {
                if (routeArray[i].toUpperCase().equals("TEMPAT3")) {
                    distance += 1.5;
                } else if (routeArray[i].toUpperCase().equals("TEMPAT4")) {
                    distance += 4;
                } else if (routeArray[i].toUpperCase().equals("TOKO")) {
                    distance += 2.5;
                    break;
                }
            }

            else if (routeArray[i - 1].toUpperCase().equals("TEMPAT3")) {
                if (routeArray[i].toUpperCase().equals("TEMPAT4")) {
                    distance += 2.5;
                } else if (routeArray[i].toUpperCase().equals("TOKO")) {
                    distance += 4;
                    break;
                }
            }

            else if (routeArray[i - 1].toUpperCase().equals("TEMPAT4")) {
                if (routeArray[i].toUpperCase().equals("TOKO")) {
                    distance += 6.5;
                    break;
                }
            }


        }
        float gas = (float) (distance / 2.5);
        System.out.println("Gas needed : " + gas + " Litre");
    }
}
