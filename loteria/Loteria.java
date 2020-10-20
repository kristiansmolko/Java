package loteria;

import java.util.Scanner;

public class Loteria {
    private int[] guess = new int[5];
    private int[] zreb = new int[10];

    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        //1 zadavanie
        loteria.inputNum();
        //2 zrebovanie
        //3 overovanie



    }


    public void inputNum(){
        int i = 0;
        int in;
        Scanner sc = new Scanner(System.in);
        while(i<5){
            System.out.print("Enter " + (i+1) + ". number: ");
            in = sc.nextInt();
            if (in > 0 && in < 21 && checkArray(i, in)){
                guess[i] = in;
                i++;
            }
            else
                System.out.println("\033[31mWrong input! Try again.\033[00m");
        }
        System.out.println("Your tips: ");
        for (i = 0; i < 5; i++){
            System.out.print((i+1) + ". tip: " + guess[i]);
            System.out.println();
        }
    }

    public boolean checkArray(int i, int in){
        if (i==0)
            return true;
        for (int j = 0; j<i; j++){
            if (guess[j]==in)
                return false;
        }
        return true;
    }
/*
    public void generate(){
        int i = 0;
        for (i = 0; i < 10; i++){

        }
    }

 */
}
