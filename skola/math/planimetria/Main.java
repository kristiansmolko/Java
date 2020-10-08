package skola.math.planimetria;

public class Main {
    public static void main(String[] args) {
        Point bod1 = new Point(4, -9);
        int quadrant = bod1.getQuadrant();
        bod1.print();
        System.out.println(quadrant);
        double distanceFromZero = bod1.getDistanceFromZero();
        System.out.println("Distance from 0 is " + distanceFromZero);

        System.out.println("");
        PointIn3D bod3D = new PointIn3D(2, 3, -8);
        bod3D.print();
        double distanceFromZero3D = bod3D.getDistanceFromZero();
        System.out.println("Distance from 0 is " + distanceFromZero3D);


    }


}
