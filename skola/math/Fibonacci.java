package skola.math;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <= 20; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        /*  FIBONACCI s polom
        res[0] = a;
        res[1] = b;
        System.out.print(res[0] + ", ");
        System.out.print(res[1]);
        for (int i = 2; i <= 20; i++) {
            c = a + b;
            res[i] = c;
            a = b;
            b = c;
            System.out.print(", " + res[i]);
        }

         */
    }
}
