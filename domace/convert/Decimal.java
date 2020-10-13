package domace.convert;

import java.util.Scanner;

public class Decimal extends Convert{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Convert cv = new Convert();

        System.out.print("Zadaj sustavu: ");
        int where = sc.nextInt();
        System.out.print("Input number: ");
        if (where == 16){
            Scanner scT = new Scanner(System.in);
            String type = scT.nextLine();
            cv.convertHexaToDecimal(type);
        }
        else if(where==2 || where==8) {
            int num = sc.nextInt();
            if (where == 2) {
                cv.convertBinaryToDecimal(num);
            } else if (where == 8) {
                cv.convertOctalToDecimal(num);
            }
        }
        else{
            System.out.print("Try again ");
            where = sc.nextInt();
        }








    }
}
