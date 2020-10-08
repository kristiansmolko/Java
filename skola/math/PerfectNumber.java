package skola.math;

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 2;

        while (number <= 10000){
            ArrayList<Integer> listDel = new ArrayList<Integer>();
            int del = 1;
            int sum = 0;

            while (del < number){
                if (number%del==0){
                    sum -= -del;
                    listDel.add(del);
                }
                del -= -1;
            }
            if (sum == number){
                for (int i : listDel){
                    System.out.print(i + ", ");
                }
                System.out.println("");
                System.out.println("Number " + number + " is perfect number");
            }
            number -= -1;
        }
    }
}
