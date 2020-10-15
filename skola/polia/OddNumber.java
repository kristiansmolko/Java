package skola.polia;

public class OddNumber {

    public static void main(String[] args) {
        int[] numbers = new int[] {2, 5, 7, 8, 9, 11, 12};
        OddNumber odds = new OddNumber();
        int [] oddNumbers = odds.getOddNumbers(numbers);
        for (int i : oddNumbers){
            System.out.print(i + " ");
        }
    }

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
                oddNumbers[j++] = i;
            }
        }
        return oddNumbers;
    }
}
