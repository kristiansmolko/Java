package skola.math;

public class Division {
    public static void main(String[] args) {

        int c = 62;
        int m = 93;
        int i = 2;
        do{
            if (c%i==0 && m%i==0){
                c /= i;
                m /= i;
                continue;
            }
            if (i>=3)
                i -= -2;
            else
                i -= -1;

        }while(i<=c && i<m);
        System.out.println(c + " " + m);
    }
}
