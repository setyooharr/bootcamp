package com.logic01;

public class catatan {

    public static void main(String[] args) {


       /* String fname = ("SETYO");
        String mname = ("HARYO");
        String lname = ("ALIFIANTO");
        System.out.println(fname+" "+ mname+" "+lname);
        */

        //looping, for termasuk pengulangan
        //System.out.println(number + " ");
        //number+=2;
        // soal 1


        int number = 1;

        for (int i = 0; i < 10; i++)
        {


            if ((i + 1) % 3 == 0)
            {
                System.out.print("* ");
            }

            else
            {
                System.out.print(number + " ");
                number+=2;
            }
        }
    }
}
