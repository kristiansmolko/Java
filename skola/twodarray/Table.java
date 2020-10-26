package skola.twodarray;

import java.util.Random;

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
        changeArray(poleXX);

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
            num = (int) (rnd.nextInt(89)+10);
        }
        return num;
    }
}
