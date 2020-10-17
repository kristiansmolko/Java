package extra;


import java.text.DecimalFormat;

public class FEIProblems {
    //Problem set 2
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        FEIProblems solve = new FEIProblems();

        /*double solution = solve.liftACar(2,80,1400);         //1
        System.out.println(df.format(solution));*/

        /*double unit = solve.unitPrice(4.79,16,150);          //2
        System.out.println(df.format(unit));*/

        //System.out.println(solve.collatzConjecture(20));     //3

        //System.out.println(solve.oppositeNumber(12,9));     //4

        /*int array[] = new int[] {1,2,3,4,5};             //5
        int resultArray[] = new int[2];
        solve.counter(array, array.length, resultArray);
        System.out.println(resultArray[0] + " " + resultArray[1]);*/


    }
    //1.
    public double liftACar(int stickLength, int HumanWeight, int CarWeight) {
        double result = stickLength*HumanWeight;
        result /= CarWeight;
        Math.round(result);
        return result;
    }
    //2.
    public double unitPrice(double packPrice, int rollsCount, int piecesCount){
        int all = rollsCount*piecesCount;
        double result = all;
        result = (packPrice*100)/result;
        return result;
    }
    //3
    public int collatzConjecture(int num){
        int n = num;
        int count = 1;
        while (n!=1){
            n = (n%2==0)?(n/2):(n*3+1);
            count -= -1;
        }
        return count;
    }
    //4
    public int oppositeNumber(int n, int number){
        int opposite = 0;
        opposite = (number>(n/2))?(number-(n/2)):(number+(n/2));
        return opposite;
    }
    //5
    public void counter(int inputArray[], int arraySize, int resultArray[]){
        int odd = 0;
        int even = 0;
        for (int i : inputArray){
            if (i%2==0)
                even -= -i;
            else
                odd -= -i;

        }
        resultArray[0] = odd;
        resultArray[1] = even;
    }


}