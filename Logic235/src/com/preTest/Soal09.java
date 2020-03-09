//public class Nomer6 {
//    public static void Resolve(int input) {
//
//
////        // input adalah jumlah kartu
////        int tawaran = 0, kotakA = 0, kotakB = 0, indexA = 0, indexB = 0;
////        int sisaKartuPlayer = input, sisaKartuComp = input;
////        String kotakPilihan;
////        String answer = "YA";
////
////        while (answer.toUpperCase().equals("YA")) {
////            Scanner inputObj = new Scanner(System.in);
//////            System.out.println();
//////        switch (inputcase){
////
////            int flag = 0;
////            while (sisaKartuPlayer > 0 && sisaKartuComp > 0 && flag == 0) {
////
////                // INPUT TAWARAN
////                System.out.println("Input tawaran : ");
////                tawaran = inputObj.nextInt();
////
////                // KOCOK ANGKA
////                kotakA = (int) (Math.random() * 9);
////                kotakB = (int) (Math.random() * 9);
////                while (kotakA == kotakB) {
////                    kotakA = (int) (Math.random() * 9);
////                    kotakB = (int) (Math.random() * 9);
////                }
////
////                // PILIH KOTAK
////                System.out.println("Pilih kotak A atau B : ");
////                inputObj.nextLine();
////                kotakPilihan = inputObj.nextLine().toUpperCase();
////
////                // TAMPILKAN ISI KOTAK
////                System.out.println("Kotak A : " + kotakA);
////                System.out.println("Kotak B : " + kotakB);
////
////                // HITUNG BAYAR ATAU TERIMA KARTU
////                if (kotakPilihan.equals("A")) {
////                    if (kotakA > kotakB) {
////                        System.out.println("Anda mendapat " + tawaran + " kartu.");
////                        sisaKartuPlayer += tawaran;
////                        sisaKartuComp -= tawaran;
////                    } else if (kotakB > kotakA) {
////                        System.out.println("Anda kehilangan " + tawaran + " kartu.");
////                        sisaKartuPlayer -= tawaran;
////                        sisaKartuComp += tawaran;
////                    }
////                } else if (kotakPilihan.equals("B")) {
////                    if (kotakB > kotakA) {
////                        System.out.println("Anda mendapat " + tawaran + " kartu.");
////                        sisaKartuPlayer += tawaran;
////                        sisaKartuComp -= tawaran;
////                    } else if (kotakA > kotakB) {
////                        System.out.println("Anda kehilangan " + tawaran + " kartu.");
////                        sisaKartuPlayer -= tawaran;
////                        sisaKartuComp += tawaran;
////                    }
////                }
////
////
////                // TAMPILKAN SISA KARTU
////                if (sisaKartuPlayer < 0) {
////                    sisaKartuPlayer = 0;
////                    sisaKartuComp = input * 2;
////                } else if (sisaKartuComp < 0) {
////                    sisaKartuComp = 0;
////                    sisaKartuPlayer = input * 2;
////                }
////                System.out.println("Sisa kartu Anda : " + sisaKartuPlayer);
////                System.out.println("Sisa kartu komputer : " + sisaKartuComp);
////
////                System.out.println();
////                System.out.println("Main Lagi ?");
////
////                // for skipping
////                answer = inputObj.nextLine();
////
////                if (answer.toUpperCase().equals("TIDAK")) {
////                    flag = 1;
////                    if (flag == 1) {
////                        if (sisaKartuPlayer > sisaKartuComp) {
////                            System.out.println("Anda Menang");
////                        } else if (sisaKartuPlayer < sisaKartuComp) {
////                            System.out.println("Anda Kalah");
////                        } else {
////                            System.out.println("DRAW");
////                        }
////                    }
////                }
////
////            }
////            if (sisaKartuPlayer <= 0 || sisaKartuComp <= 0) {
////                if (sisaKartuPlayer > sisaKartuComp) {
////                    System.out.println("Anda Menang");
////                } else if (sisaKartuPlayer < sisaKartuComp) {
////                    System.out.println("Anda Kalah");
////                } else {
////                    System.out.println("DRAW");
////                }
////            }
////        }
//    }
//}