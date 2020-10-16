package skola.math;

import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and koeficient:");
        int cm = sc.nextInt();
        double kO = sc.nextDouble();
        System.out.println(ball.countImpact(cm, kO));

    }

    public int countImpact(int cm, double kO){
        int count = 0;
        while (cm>=100){
            cm *= kO;
            count -= -1;
        }
        return count;
    }
}
