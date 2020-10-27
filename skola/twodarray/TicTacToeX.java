package skola.twodarray;

import java.util.Scanner;

public class TicTacToeX {
    private int[][] pole;
    private int player;

    public TicTacToeX(){
        pole = new int[5][5];
        initArray();
    }
    public static void main(String[] args) {
        TicTacToeX game = new TicTacToeX();
        game.TicTacToe();
    }


    public void TicTacToe(){
        Scanner sc = new Scanner(System.in);
        int turn = 1;
        player = 1;
        print();
        while (turn <= 25 && isWinner()==0){
            System.out.println(player + " player, choose number");
            int choice = sc.nextInt();
            if (choice<1 || choice>25){
                System.out.println("\033[31mWrong number\033[0m");
                continue;
            }
            int r = 0;
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if (choice-1 == r){
                        if (0 == pole[i][j]){
                            pole[i][j] = player;
                            player -= -1;
                            turn -= -1;
                        }
                        else{
                            System.out.println("\033[31mThis tile is taken, try again!\033[0m");
                            r -= -1;
                            continue;
                        }

                    }
                    r -= -1;
                }
                if (player > 3){
                    player = 1;
                }
            }
            print();
            isWinner();
            if(isWinner()!=0)
                System.out.println("Winner is \033[31m" + isWinner() + "\033[0m. player!");
        }
        if (isWinner()==0){
            System.out.println("\033[31mUnfortunately we don't have a winner\033[0m");
        }
    }

    private int isWinner(){
        for (int i = 0; i < 5; i++){
            if ((pole[0][i]==1 && pole[1][i]==1 && pole[2][i]==1 && pole[3][i]==1)
                    || (pole[1][i]==1 && pole[2][i]==1 && pole[3][i]==1 && pole[4][i]==1)
                    || (pole[i][0]==1 && pole[i][1]==1 && pole[i][2]==1 &&pole[i][3]==1)
                    || (pole[i][1]==1 && pole[i][3]==1 && pole[i][2]==1 &&pole[i][4]==1)){
                return 1;
            }

            if ((pole[0][i]==2 && pole[1][i]==2 && pole[2][i]==2 && pole[3][i]==2)
                || (pole[1][i]==2 && pole[2][i]==2 && pole[3][i]==2 && pole[4][i]==2)
                || (pole[i][0]==2 && pole[i][1]==2 && pole[i][2]==2 &&pole[i][3]==2)
                || (pole[i][1]==2 && pole[i][3]==2 && pole[i][2]==2 &&pole[i][4]==2)){
                return 2;
            }

            if ((pole[0][i]==3 && pole[1][i]==3 && pole[2][i]==3 && pole[3][i]==3)
                    || (pole[1][i]==3 && pole[2][i]==3 && pole[3][i]==3 && pole[4][i]==3)
                    || (pole[i][0]==3 && pole[i][1]==3 && pole[i][2]==3 &&pole[i][3]==3)
                    || (pole[i][1]==3 && pole[i][3]==3 && pole[i][2]==3 &&pole[i][4]==3)){
                return 3;
            }
            if (diagonalX() != 0)
                return diagonalX();
            else if(diagonalY() != 0)
                return diagonalY();
        }
        return 0;
    }

    private int diagonalX(){
        int init = 4;
        while (init <= 10) {
            int[] poleNew = new int[5];
            int init2 = init++;
            int count = 1;
            int poleC = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (init2 == count && poleC <= 4){
                        poleNew[poleC] = pole[i][j];
                        init2 -= -4;
                        poleC -= -1;
                    }
                    count -= -1;
                }
            }
            for (int i : poleNew){
                switch(i){
                    case 1: count1 -= -1; break;
                    case 2: count2 -= -1; break;
                    case 3: count3 -= -1; break;
                }
            }
            if (count1 == 4)
                return 1;
            else if (count2 == 4)
                return 2;
            else if (count3 == 4)
                return 3;
        }
        return 0;
    }

    private int diagonalY(){
        int init = 1;
        while (init <= 7) {
            int[] poleNew = new int[5];
            int init2 = init++;
            int count = 1;
            int poleC = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (init2 == count && poleC <= 4) {
                        poleNew[poleC] = pole[i][j];
                        init2 -= -6;
                        poleC -= -1;
                    }
                    count -= -1;
                }
            }
            for (int i : poleNew) {
                switch (i) {
                    case 1:
                        count1 -= -1;
                        break;
                    case 2:
                        count2 -= -1;
                        break;
                    case 3:
                        count3 -= -1;
                        break;
                }
            }
            if (count1 == 4)
                return 1;
            else if (count2 == 4)
                return 2;
            else if (count3 == 4)
                return 3;
        }
        return 0;
    }


    private void print() {
        System.out.println("\033[32m+-----+\033[0m");
        for (int i = 0; i < 5; i++) {
            System.out.print("\033[32m|\033[0m");
            for (int j = 0; j < 5; j++) {
                if (pole[i][j] == 1)
                    System.out.print("\033[31m" + pole[i][j] + "\033[0m");
                else if (pole[i][j] == 2)
                    System.out.print("\033[33m" + pole[i][j] + "\033[0m");
                else if (pole[i][j] == 3)
                    System.out.print("\033[34m" + pole[i][j] + "\033[0m");
                else
                    System.out.print(pole[i][j]);
            }
            System.out.print("\033[32m|\033[0m");
            System.out.println();
        }
        System.out.println("\033[32m+-----+\033[0m");
    }

    private void initArray() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                pole[i][j] = 0;
            }
        }
    }
}
