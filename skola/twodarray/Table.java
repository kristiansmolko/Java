package skola.twodarray;

import java.util.Random;
import java.util.Scanner;

public class Table {
    private int[][] arr = new int[][]{ {2,5,8,0},{5,1,7,9},{-9,1,8,14}};

    public static void main(String[] args) {
        int[][] poleXX= new int[][]{ {2,5,8,0},{13,21,37,49},{-9,1,8,14}};
        Table t = new Table();
        /*int value = t.min();
        System.out.println("Minimum is: " + value);
        value = t.max();
        System.out.println("Maximum is: " + value);
        double avg = t.avg();
        System.out.println("Average is: " + avg);
        value = t.sumUnderDiagonale();
        System.out.println("Summary is: " + value);
        int[][] newPole = transponovanaMatica(poleXX);
        t.print(newPole);*/
        t.ticTacToe();

    }

    public int min(){
        int minimum = arr[0][0];
        for (int i = 0; i < 3; i++){
            for ( int j = 0; j < 4; j++){
                minimum = arr[i][j]<minimum?arr[i][j]:minimum;
            }
        }
        return minimum;
    }

    public int max(){
        int maximum = arr[0][0];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                maximum = arr[i][j]>maximum?arr[i][j]:maximum;
            }
        }
        return maximum;
    }

    public double avg(){
        double avg = 0;
        int count = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                avg += (arr[i][j]);
                count -= -1;
            }
        }
        avg /= count;
        return avg;
    }

    public int sumUnderDiagonale(){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    //private int[][] arr = new int[][]{ {2,5,8,0},{5,1,7,9},{-9,1,8,14}};
    public static int[][] transponovanaMatica(int[][] pole){
        int row = pole.length;
        int col = pole[0].length;
        int[][] r = new int[col][row];
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                r[i][j] = pole[j][i];
            }
        }
        return r;
    }

    public void print(int[][] p){
        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p[0].length; j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeArray(int[][] arr){
        int length = arr.length*arr[0].length;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                int num = arr[i][j];
                if (num < 0){
                    num = firstOption(num);
                }
                else if (num > 0 && num%2!=0){
                    num = secondOption(num);
                }
                else{
                    num = thirdOption(num);
                }
                arr[i][j] = num;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int firstOption(int num){
        num = -num;
        return num;
    }

    public static int secondOption(int num){
        int sameNum = num;
        int find = sameNum/10;
        if (num>10)
            num = (find%2==0)?num-1:num+1;
        return num;
    }

    public static int thirdOption(int num){
        Random rnd = new Random();
        if (num == 0){
            num = (int) (rnd.nextInt(90)+10);
        }
        return num;
    }

    //tic-tac-toe
    //0,1,2 v tabulke

    public char[][] ticTacToe(){
        Scanner sc = new Scanner(System.in);
        char[][] tic = new char[][] {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};


        int turn = 1;
        int who = 1;
        while (turn<=9){
            for (int i = 0; i < tic.length; i++){
                for (int j = 0; j < tic[0].length; j++){
                    System.out.print(tic[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print(who + ". turn, choose your number: ");
            int choice = sc.nextInt();
            for (int i = 0; i < tic.length; i++){
                for(int j = 0; j < tic[0].length; j++){
                    char z = tic[i][j];
                    if (choice+48==(int)z) {
                        if (z == 'X' || z == 'O') {
                            System.out.println("\033[31mThis is taken, try another one!\033[0m");
                        } else {
                            if (who == 1) {
                                tic[i][j] = 'X';
                                who = 2;
                            } else {
                                tic[i][j] = 'O';
                                who = 1;
                            }
                            turn -= -1;
                            break;
                        }
                    }
                }
            }
            if (checkTicTacToe(tic)!=0){
                int winner = checkTicTacToe(tic);
                System.out.println(winner + ". has won");
                break;
            }
        }
        return tic;
    }

    public int checkTicTacToe(char[][] arr){
        int winner = 0;
        int col = 0;
        int colX = 0;
        int rowX = 0;
        int rowO = 0;
        int colO = 0;
        int diagonalX = 0;
        int diagonalO = 0;
        for (int i = 0; i < arr.length; i++){
            if (winner != 0)
                break;
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j]=='X'){
                    rowX -= -1;
                }
                else if(arr[i][j]=='O'){
                    rowO -= -1;
                }

                if (arr[j][i]=='X'){

                    colX -= -1;
                }
                else if (arr[j][i]=='O'){
                    colO -= -1;
                }

                if (arr[j][j] == 'X'){
                    diagonalX -= -1;
                }
                else if (arr[j][j] == 'O'){
                    diagonalO -= -1;
                }

                if (arr[0][2] == arr[2][0]){
                    if (arr[0][2] == arr[1][1]){
                        if (arr[2][0]=='X'){
                            winner = 1;
                        }
                    }
                }
                if (arr[0][2] == arr[2][0]){
                    if (arr[0][2] == arr[1][1]){
                        if (arr[2][0]=='O'){
                            winner = 2;
                        }
                    }
                }

                if (rowX==3 || colX==3 || diagonalX==3){
                    winner = 1;
                    break;
                }
                else if (rowO==3 || colO==3 || diagonalO==3){
                    winner = 2;
                    break;
                }
            }

            colX = 0;
            colO = 0;
            rowX = 0;
            rowO = 0;
            diagonalO = 0;
            diagonalX = 0;
        }
        return winner;
    }
}
