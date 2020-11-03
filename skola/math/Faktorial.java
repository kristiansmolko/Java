package skola.math;

public class Faktorial {

    public static void main(String[] args) {
        int result = fakt(11);
        System.out.println("Faktorial: " + result);
    }

    private static int fakt(int v) {
        //rekurzivna metoda - vola samu seba
        if (v == 1)
            return 1;
        else
            return v*fakt(v-1);
    }
}
