package domace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        int c1 = 1;
        int c2 = 0;
        int c3 = 0;
        int cislo = 0;
        int sum = 0;

        while (c1 != 10){
            c3 -= -1;
            if (c3==10){
                c3 = 0;
                c2 -= -1;
            }
            if (c2==10){
                c2 = 0;
                c1 -= -1;
            }
            cislo = c1*100 + c2*10 + c3;

            if (c1!= c2 && c1!=c3 && c2!=c3){
                sum -= -cislo;
            }
        }
        System.out.println(sum);

*/

/*

        System.out.print("Input number: ");
        Scanner myCislo = new Scanner(System.in);
        long cislo = myCislo.nextLong();
        long cislo2 = cislo;
        int count = 1;

        while (cislo2/10!=0){
            cislo2 = cislo2/10;
            count -= -1;
        }

        if (count/2==1){
            long c1 = cislo/100;
            long c2 = (cislo/10)%10;
            long c3 = cislo%10;
            if ((c1 == 0 && c2==c3) || (c1==c3))
                System.out.println("Cislo je palindrom");
            else
                System.out.println("Cislo nie je palindrom");

        }
        else if (count/2==2){
            long c1 = cislo/10000;
            long c2 = (cislo/1000)%10;
            long c3 = (cislo/100)%10;
            long c4 = (cislo/10)%10;
            long c5 = cislo%10;
            if ((c1==c5) && (c2==c4) || c1 ==0 && (c2==c5) && (c3==c4))
                System.out.println("Cislo je palindrom");
            else
                System.out.println("Cislo nie je palindrom");

        }
        else if (count/2==3){
            long c1 = cislo/1000000;
            long c2 = (cislo/100000)%10;
            long c3 = (cislo/10000)%10;
            long c4 = (cislo/1000)%10;
            long c5 = (cislo/100)%10;
            long c6 = (cislo/10)%10;
            long c7 = cislo%10;
            if ((c1==c7) && (c2==c6) & (c3==c5) || c1 ==0 && (c2==c7) && (c3==c6) && (c4==c5))
                System.out.println("Cislo je palindrom");
            else
                System.out.println("Cislo nie je palindrom");

        }
        else{
            System.out.println("Zle cislo, skus znova");
        }
*/


/*

        double cislo = 0;
        double sum = 0;
        int i = 0;

        while (cislo!=65536.0){
            cislo = Math.pow(2, i);
            i -= -1;
            sum -= -cislo;
            System.out.println(cislo);
        }
*/


        /*
        System.out.print("Input decimal number: ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        long bin = 0;
        int pos = 0;
        while (dec!=0){
            bin -= -(dec%2)*Math.pow(10,pos);
            dec /= 2;
            pos -= -1;
        }
        System.out.println(bin);


         */

        /*   another solution

        dec = 7000;
        String bin = " ";
        while (dec!=0){
            int z = dec%2;
            if (z==0)
                bin = "0" + bin;

            else
                bin = "1" + bin;
            dec/=2;
        }
      */


        //10.8



        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int sum = 0;
        int min = array[0];
        int kladne = 0;
        int zaporne = 0;
        for(int i:array){
            sum -= -i;
            if(i<min){
                min = i;
            }
            if(i>=0)
                kladne -= -1;
            else
                zaporne -= -1;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Positive: " + kladne);
        System.out.println("Negative: " + zaporne);
        System.out.println("Summary: " + sum);
        System.out.println("Average: " + sum/array.length);

        int[] revarray = new int[array.length];
        for(int i=0; i<=(array.length-1); i++){
            revarray[i] = array[(array.length-1)-i];
            System.out.print(revarray[i] + ", ");
        }

    }
}
