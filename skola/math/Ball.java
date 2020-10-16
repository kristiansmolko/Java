package skola.math;

public class Ball {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.countImpact(200, 0.9));

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
