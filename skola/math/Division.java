package skola.math;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers you want to divide:");
        int c = sc.nextInt();
        int m = sc.nextInt();
        int i = 2;
        do{
            if (c%i==0 && m%i==0){
                c /= i;
                m /= i;
                continue;
            }
            i = (i>=3)?(i-=-2):(i-=-1); //ternarny operator

        }while(i<=c && i<m);
        System.out.println(c + " " + m);
    }
}
