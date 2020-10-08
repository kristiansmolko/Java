package skola.math.normal;

public class Rectangle implements MathOperation{
    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }


    @Override
    public double calcPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    public double calcDiagonale(){
        return Math.sqrt((a*a)+(b*b));
    }
}
