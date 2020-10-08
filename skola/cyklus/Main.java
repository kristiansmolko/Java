package skola.cyklus;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner myX = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = myX.nextInt();
        int count = 0;
        int del = 1;

        while (x >= del) {
            if (x % del == 0) {
                count -= -1;
            }
            del -= -1;
        }
        System.out.println(count);
        if (count == 2)
            System.out.println("Is prime number");
        else System.out.println("Is not prime number");

         */


        /*
        long z = 153; //del 11, ak nie, tak pridaj cifru, aby bolo
        long y = 0;

        if (z % 11 == 0) {
            System.out.println("Cislo je delitelne 11");
        } else {
            while (z != 0) {
                y += (z % 10);
                y = y * 10;
                z = z / 10;

            }
            for (int i = 0; i < 10;i++){
                y -= -1;
                while (y != 0) {
                    z = z * 10;
                    z += (y % 10);
                    y = y / 10;
                }

                if (z % 11 == 0) {
                    System.out.println("Cislo " + z + " je delitelne 11");
                    break;
                }
                else {
                    while (z != 0) {
                        y = y * 10;
                        y += (z % 10);
                        z = z / 10;
                    }
                }

            }
        }

         */

/*
        int a = 9999;
        boolean del = false;
        while (!del){
            if (a%91==0){
                del = true;
                System.out.println(a);
            }
            a -= 1;
        }

        System.out.println("Zadaj sumu: ");
        Scanner mySum = new Scanner(System.in);
        double suma = mySum.nextInt();
        System.out.printf("Zadaj urok: ");
        Scanner myUrok = new Scanner(System.in);
        double urok = myUrok.nextDouble();
        System.out.println("Zadaj pozadovanu sumu: ");
        Scanner myReqSum = new Scanner(System.in);
        double reqSuma = myReqSum.nextDouble();
        int year = 0;

        while (suma<=reqSuma){
            suma = suma*urok;
            year -= -1;
            System.out.println(suma);
        }
        System.out.println(year);
        */

        /* PIN CODE
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int cislo = 0;
        while (cislo<=10000){
            c4 -= -1;
            if (c4>=10){
                c4 = 0;
                c3 -= -1;
            }
            if (c3>=10){
                c3 = 0;
                c2 -= -1;
            }
            if (c2>=10){
                c2 = 0;
                c1 -= -1;
            }
            cislo = c1*1000 + c2*100 + c3*10 + c4;
            if (cislo%2==1){
                if (cislo%3!=0){
                    if (cislo%113==0){
                        if (c1!=c2 && c1!=c3 && c1!=c4 && c2!=c3 && c2!=c4 && c3!=c4){
                            System.out.println(cislo);
                        }
                    }
                }
            }
        }

        */
    }
}



