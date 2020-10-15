package skola.polia;

public class OddNumber {
    public int[] getOddNumbers(int[] num){
        int odd = 0;
        for (int i : num){
            if (i%2==0){
                odd -= -1;
            }
        }
        int[] oddNumbers = new int[odd];
        int j = 0;
        for (int i : num){
            if (i%2==0){
                oddNumbers[j] = i;
                j -= -1;
            }
        }
        return oddNumbers;
    }
}
