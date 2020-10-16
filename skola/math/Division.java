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
            i = (i>=3)?(i-=-2):(i-=-1); //ternarny operator

        }while(i<=c && i<m);
        System.out.println(c + " " + m);
    }
}
