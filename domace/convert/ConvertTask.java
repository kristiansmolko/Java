package domace.convert;

import java.util.Scanner;

public class ConvertTask extends Convert{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int dec = sc.nextInt();
        Convert cv = new Convert();

        while(dec<=0){
            System.out.print("\033[31mTry again: \033[0m");
            dec = sc.nextInt();
        }

        System.out.print("Sustava: ");
        int n = sc.nextInt();

        while(true) {
            if (n == 2 || n == 8 || n == 16) {
                break;
            }
            System.out.print("\033[31mTry again: \033[0m");
            n = sc.nextInt();
        }

        if(n==2){
            cv.convertToBinary(dec);
        }
        else if(n==8){
            cv.convertToOctal(dec);
        }
        else if(n==16){
            cv.convertToHexadecimal(dec);
        }

        /*
        if(n==2){
                long bin = 0;
                int pos = 0;
                while (dec!=0) {
                    bin -= -(dec % 2) * Math.pow(10, pos);
                    dec /= 2;
                    pos -= -1;
                }
                System.out.println("Binary number: " + bin);
        }
        else if(n==8){
            int oct = 0;
            int pos = 0;
            while (dec!=0){
                oct -= -(dec%8)*Math.pow(10, pos);
                dec /= 8;
                pos -= -1;
            }
            System.out.println("Octal number: " + oct);
        }
        else if(n==16){
            String hex = "";
            while (dec != 0) {
                int z = dec % 16;
                if (z <= 9) {
                    hex = "" + z + "" + hex;
                } else if (z == 10) {
                    hex = "A" + hex;
                } else if (z == 11) {
                    hex = "B" + hex;
                } else if (z == 12) {
                    hex = "C" + hex;
                } else if (z == 13) {
                    hex = "D" + hex;
                } else if (z == 14) {
                    hex = "E" + hex;
                } else
                    hex = "F" + hex;
                dec /= 16;
            }
            System.out.println("Hexadecimal number: " + hex);
        }

         */



    }
}
