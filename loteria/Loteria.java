package loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    private final int TIP_LENGTH = 5;
    private final int ZREB_LENGTH = 10;
    private final int MAX_VALUE = 25;
    private int[] guess = new int[TIP_LENGTH];
    private int[] zreb = new int[ZREB_LENGTH];

    public static void main(String[] args) {
        Loteria loteria = new Loteria();

        //0 vklad
        double money = loteria.inputMoney();
        //1 zadavanie
        loteria.inputNum();
        //2 zrebovanie
        loteria.generate();
        //3 overovanie
        int right = loteria.checking();
        System.out.println("\033[34mYou have " + right + " right answers!\033[0m");
        //4 vyhra
        loteria.win(right, money);
        //0 - 1 :0e
        //2 - *2 vklad
        //3 - *15 vklad
        //4 - *500 vklad
        //5 - *10000

    }

    public double inputMoney(){
        double insert;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("How much do you want to pay?");
            insert = sc.nextInt();
            if (insert<=0){
                System.out.println("\033[31mWrong price, please try again\033[0m");
            }
        }
        while (insert <= 0);
        return insert;
    }

    public void inputNum(){  //+ nahodny vyber cisel alebo sam chcem napisat
        int i = 0;
        int in;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to write your numbers? \033[31m(Yes/No)\033[0m");
        String answer = sc.nextLine();
        if(answer.equals("No") || answer.equals("no")){
            while(i < guess.length) {
                int ourGuess = (int) (Math.random() * MAX_VALUE + 1);
                if (checkArray(i, ourGuess)){
                    guess[i] = ourGuess;
                    i++;
                }
            }
        }
        else {
            while (i < guess.length) {
                System.out.print("Enter " + (i + 1) + ". number: ");
                in = sc.nextInt();
                if (in > 0 && in <= MAX_VALUE && checkArray(i, in)) {
                    guess[i] = in;
                    i++;
                } else
                    System.out.println("\033[31mWrong input! Try again.\033[00m");
            }
        }
        System.out.println("Your tips: ");
        for (i = 0; i < guess.length; i++) {
            System.out.print((i + 1) + ". tip: " + guess[i]);
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
        while (i < zreb.length){
            int num = (int) (Math.random()*(MAX_VALUE)+1);
            if(checkArrayZreb(i, num)){
                zreb[i] = num;
                i++;
            }
        }
        Arrays.sort(zreb); //aby sme mali sortnute
         //pre zistenie, ci to funguje
        for (i = 0; i < zreb.length; i++){
            System.out.print(zreb[i] + " ");
        }

    }

    public int checking(){
        int right = 0;
        for (int k : guess) {
            for (int j = 0; j < zreb.length; j++) {
                if (k == zreb[j])
                    right -= -1;
            }
        }
        return right;
    }

    public void win(int right, double insert){
        double win = switch (right) {
            case 0, 1 -> 0;
            case 2 -> insert * 2;
            case 3 -> insert * 15;
            case 4 -> insert * 500;
            case 5 -> insert * 10000;
            default -> 0;
        };
        System.out.println("You have won: \033[31m" + (int)win + "$!\033[0m" );
    }


}
