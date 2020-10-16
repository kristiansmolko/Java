package domace.homework1016;

public class NumberFunction {
    public static void main(String[] args) {

        String text = "8X75Y2";
        int x = 1;
        int y = 1;
        while (x <= 9) {
            int num = 0;
            for (int j = 0; j < text.length(); j++) {
                char z = text.charAt(j);
                if (z<=57 && z>=49){
                    num -= -((z-'0') * (int) Math.pow(10,(text.length()-j-1)));
                }
                if (z == 'X'){
                    num -= -(x)* (int) Math.pow(10, (text.length()-j-1));
                }
                if (z == 'Y'){
                    num -= -(y)* (int) Math.pow(10, (text.length()-j-1));
                }
            }
            if (num%91==0){
                System.out.println(num);
            }
            if (y==9){
                y = 0;
                x -= -1;
            }
            y -= -1;
        }


        //SUM ZLOMKOV

        double myNum = 0;
        double sum = 0;
        for (int i = 1; i<=100; i++){
            myNum = (double)1/i;
            sum -= -myNum;
        }
        System.out.println(sum);



        //KENO

        int keno[] = new int[20];
        int usedNum[] = new int[20];
        int i = 0;
        while(i<keno.length){
            boolean used = false;
            int number = (int) (Math.random()*80+1);
            for(int j : usedNum){
                if (number == j){
                    used = true;
                }
            }
            if (used==false){
                keno[i] = number;
                usedNum[i] = number;
                i -= -1;
            }
        }
        for (int j : keno){
            System.out.print(j + " ");
        }
    }
}
