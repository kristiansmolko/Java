package skola.polia;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c= 0;
        int res[] = new int[21];

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


    }
}
