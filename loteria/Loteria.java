package loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    private final int TIP_LENGTH = 5;
    private final int ZREB_LENGTH = 10;
    private final int MAX_VALUE = 13;
    private int[] guess = new int[TIP_LENGTH];
    private int[] zreb = new int[ZREB_LENGTH];

    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        //1 zadavanie
        loteria.inputNum();
        //2 zrebovanie
        loteria.generate();
        //3 overovanie
        loteria.checking();



    }


    public void inputNum(){
        int i = 0;
        int in;
        Scanner sc = new Scanner(System.in);
        while(i<guess.length){
            System.out.print("Enter " + (i+1) + ". number: ");
            in = sc.nextInt();
            if (in > 0 && in <= MAX_VALUE && checkArray(i, in)){
                guess[i] = in;
                i++;
            }
            else
                System.out.println("\033[31mWrong input! Try again.\033[00m");
        }
        System.out.println("Your tips: ");
        for (i = 0; i < guess.length; i++){
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

    public boolean checkArrayZreb(int i, int in){
        if (i==0)
            return true;
        for (int j = 0; j<i; j++){
            if (zreb[j]==in)
                return false;
        }
        return true;
    }

    public void generate(){
        int i = 0;
        boolean is = false;
        while (i < zreb.length){
            int num = (int) (Math.random()*(MAX_VALUE)+1);
            if(checkArrayZreb(i, num)){
                zreb[i] = num;
                i++;
            }
        }
        Arrays.sort(zreb); //aby sme mali sortnute
        /* //pre zistenie, ci to funguje
        for (i = 0; i < 10; i++){
            System.out.print(zreb[i] + " ");
        }
         */
    }

    public void checking(){
        int right = 0;
        for (int i = 0; i < guess.length; i++){
            for (int j = 0; j < zreb.length; j++){
                if (guess[i] == zreb[j])
                    right -= -1;
            }
        }
        System.out.println("\033[34mYou have " + right + " right answers!\033[0m");
    }


}
