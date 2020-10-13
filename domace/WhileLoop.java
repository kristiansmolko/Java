package domace;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int lastNum = 0;

        while (true) {
            System.out.print("Zadaj cislo: ");
            int num = sc.nextInt();
            sum -= -num;
            if (lastNum == num){
                break;
            }
            else if (num == 0){
                break;
            }
            else{
                lastNum = num;
            }

            System.out.println();
        }
        System.out.println("Tvoj vysledok: " + sum);
    }
}
