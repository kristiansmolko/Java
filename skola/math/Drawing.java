package skola.math;

import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {

        /*
        //STVOREC
        System.out.print("Zadaj aku velku stranu ma stvorec: ");
        Scanner premenna = new Scanner(System.in);
        int n = premenna.nextInt();
        for (int i = 1; i<=n; i++){
            if ((i==(n/n)) || (i==n)){
                for (int j = 1; j<=n; j++){
                    System.out.print("#");
                }
            }
            else{
                System.out.print("#");
                for (int k = 1; k<=(n-2); k++){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
*/


        /*
              //TROJUHOLNIK

        System.out.print("Zadaj velkost trojuholnika: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        for (int i = n; i>0; i--){
            for (int j = (i-1); j>0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=l; k++){
                System.out.print("*");
            }
            System.out.println();
            l -= -1;
        }
        l -= 1;
        for (int i = 1; i<=(n-1); i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<l; k++){
                System.out.print("*");
            }
            System.out.println();
            l -= 1;
        }

         */


        /*
                //3uholnik

        for (int i = 1; i<5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        for (int i = n; i>0; i--){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=l; k++){
                System.out.print("*");
            }
            l -= -2;
            System.out.println();
        }

         */




        Scanner sc = new Scanner(System.in);
        System.out.print("Zadaj a: ");
        double a = sc.nextInt();
        System.out.print("Zadaj b: ");
        double b = sc.nextInt();
        System.out.print("Zadaj c: ");
        double c = sc.nextInt();
        if((a+b>c && b+c>a && a+c>b)){
            if(a>b && a>c){
                if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2))
                    System.out.println("Trojuholnik je pravouhly");
                else
                    System.out.println("Trojuholnik nie je pravouhly");
            }
            if(b>a && b>c){
                if(Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2))
                    System.out.println("Trojuholnik je pravouhly");
                else
                    System.out.println("Trojuholnik nie je pravouhly");
            }
            if(c>a && c>b){
                if(Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))
                    System.out.println("Trojuholnik je pravouhly");
                else
                    System.out.println("Trojuholnik nie je pravouhly");
            }

        }
        else if(a<0 || b<0 || c<0){
            System.out.println("Trojuholnik sa neda urobit");
        }
        else {
            System.out.println("Trojuholnik sa neda urobit");
        }
    }
}
